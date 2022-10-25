import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        list.add(map);
        map.put("xxx", "xxxxx");
        map.put("yyy", "xxxxx");
        map.put("zzz", "xxxxx");

        map = new HashMap<>();
        list.add(map);
        map.put("aaa", "xxxxx");
        map.put("bbb", "xxxxx");
        map.put("b", "xxxxx");

        List<Set<String>> setList = list.stream()
                .map(Map::keySet)
                .collect(Collectors.toList());

        System.out.println(list.size());
        System.out.println(setList);
        System.out.println("clear befor");
        list.clear();
        System.out.println("clear after");
        System.out.println(list.size());
        System.out.println(setList);
    }
}
