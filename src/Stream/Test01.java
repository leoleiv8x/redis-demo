package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream流使用
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("111", "222", "333", "444");

        List<String> resultList = list.stream().map(obj -> "aaa" + obj).collect(Collectors.toList());  //Collectors.toCollection(LinkedList::new)
        System.out.println(resultList);
        System.out.println("====================");

        //JDK8 收集器和集合
        //joining拼接函数 3个重载方法
        List<String> list1 = Arrays.asList("SpringBoot", "Maven", "Git", "Linux");
        String collect = list1.stream().collect(Collectors.joining());
        System.out.println(collect);
        String collect1 = list1.stream().collect(Collectors.joining("+"));
        System.out.println(collect1);
        String result = Stream.of("springb  oot", "mysql", "html5", "css3").collect(Collectors.joining(",", "[", "]"));
        System.out.println(result);

        //partitioningBy分组 Collectors.partitioningBy 分组，key是boolean类型  静态方法可省略 直接导入
        List<String> list2 = Arrays.asList("java", "springboot", "HTML5","nodejs","CSS3");
        Map<Boolean, List<String>> result2 = list2.stream().collect(Collectors.partitioningBy(obj -> obj.length() > 4));
        System.out.println(result2);


        //group by分组
        List<Student1> students = Arrays.asList(new Student1("⼴东", 23), new
                Student1("⼴东", 24), new Student1("⼴东", 23),new Student1("北京", 22), new
                Student1("北京", 20), new Student1("北京", 20),new Student1("海南", 25));
        //System.out.println("0000000000000000000000000000000000000000000000000000000000");
        //List<Integer> listaa = students.stream().map(obj -> obj.getAge()).collect(Collectors.toList());
        //System.out.println(listaa);
        Map<String, List<Student1>> collect2 = students.stream().collect(Collectors.groupingBy(obj -> obj.getProvince()));
        collect2.forEach((key, value) -> {                                              //类::普通方法 String:length  Student1::getProvince
            System.out.println("======");
            System.out.println(key);
            value.forEach(obj -> System.out.println(obj.getAge()));
        });

        //group by进阶
        //聚合函数进⾏统计查询，分组后统计个数
        //Collectors.counting() 统计元素个数
        System.out.println("====================================");
         Map<String, Long> listMap = students.stream().collect(Collectors.groupingBy(Student1::getProvince, Collectors.counting()));
         listMap.forEach((key, value) -> System.out.println(key+"省⼈数有 "+value));

        //summarizing集合统计 可以⼀个⽅法把统计相关的基本上都完成
        //分类
        //summarizingInt
        //summarizingLongw
        //summarizingDouble
        System.out.println("summarizing集合统计-----------------");
        IntSummaryStatistics summaryStatistics = students.stream().collect(Collectors.summarizingInt(Student1::getAge));
        System.out.println("平均值：" + summaryStatistics.getAverage());
        System.out.println("⼈数：" + summaryStatistics.getCount());
        System.out.println("最⼤值：" + summaryStatistics.getMax());
        System.out.println("最⼩值：" + summaryStatistics.getMin());
        System.out.println("总和：" + summaryStatistics.getSum());
    }
}

class Student1 {
    private String province;
    private int age;
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Student1(String province, int age) {
        this.age = age;
        this.province = province;
    }
}