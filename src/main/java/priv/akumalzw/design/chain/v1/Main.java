package priv.akumalzw.design.chain.v1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "测试，测试 <akumalzw> 我的最爱是 aaa，访问我吧。。";
        Response response = new Response();
        response.str = "这是返回值：";

        FilterChain chain = new FilterChain();
        chain.add(new HtmlFilter()).add(new SensitiveFilter());
        chain.doFilter(request, response, chain);

        System.out.println(request.str);
        System.out.println(response.str);
    }
}


interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);

    String getName();
}

class FilterChain implements Filter {
    List<Filter> filterList = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index >= filterList.size()) {
            return;
        }
        // 获取当前链，然后把指针往后移动
        Filter filter = filterList.get(index);
        System.out.println("preview, index = " + index + ", chain=" + filter.getName());
        index++;
        // 执行当前链的方法
        filter.doFilter(request, response, chain);
        System.out.println("after, index = " + index + ", chain=" + filter.getName());
    }

    @Override
    public String getName() {
        return "filterChain";
    }
}

class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]") + "HtmlFilter()";
        chain.doFilter(request, response, chain);
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
        chain.doFilter(request, response, chain);
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