package priv.akumalzw.design.chain.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟 server 的 filterChain，主要是 FilterChain
 * Struct2 拦截器，Spring MVC 拦截器 也是用的这种方式
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "测试，测试 <akumalzw> 我的最爱是 aaa，访问我吧。。";
        Response response = new Response();
        response.str = "这是返回值：";

        FilterChain chain = new FilterChain();
        chain.add(new HtmlFilter()).add(new SensitiveFilter());
        chain.doFilter(request, response);

        System.out.println(request.str);
        System.out.println(response.str);
    }
}


interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);

    String getName();
}

class FilterChain {
    List<Filter> filterList = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index >= filterList.size()) {
            return;
        }
        // 获取当前链，然后把指针往后移动
        Filter filter = filterList.get(index);
        System.out.println("preview, index = " + index + ", chain=" + filter.getName());
        index++;
        // 执行当前链的方法
        filter.doFilter(request, response, this);
        System.out.println("after, index = " + index + ", chain=" + filter.getName());
    }
}

class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]") + "HtmlFilter()";
        chain.doFilter(request, response);
        response.str += "<-- HtmlFilter()";
    }

    @Override
    public String getName() {
        return "htmlFilter";
    }
}

class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("aaa", "lmm") + "--> SensitiveFilter()";
        chain.doFilter(request, response);
        response.str += "<-- SensitiveFilter()";
    }

    @Override
    public String getName() {
        return "sensitiveFilter";
    }
}

class Request {
    String str;
}

class Response {
    String str;
}