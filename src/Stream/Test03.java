package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * sorted limit
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("springboot", "springcloud",
                "redis", "git", "netty", "java", "html", "docker");

        //sorted() 对流进⾏⾃然排序, 其中的元素必须实现Comparable 接⼝
        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
        //自定义升序  升序                                                   String::length
        List<String> collect1 = list.stream().sorted(Comparator.comparing(obj -> obj.length())).collect(Collectors.toList());
        System.out.println(collect1);
        //降序
        List<String> collect2 = list.stream().sorted(Comparator.comparing(obj -> obj.length(), Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(collect2);
        //

        List<String> collect3 = list.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
        System.out.println(collect3);
        //截断流使其最多只包含指定数量的元素
        List<String> collect4 = list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(collect4);
    }

}
