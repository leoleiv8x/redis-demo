package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * reduce 根据⼀定的规则将Stream中的元素进⾏计算后返回⼀个唯⼀的值
 * foreach
 */
public class Test06 {
    public static void main(String[] args) {

        //串行流 并行流
        //顺序输出
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream().forEach(System.out::println);
        //并⾏乱序输出
        List<Integer> numbe = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbe.parallelStream().forEach(System.out::println);

        //System.out的作用肯定就是来获取PrintStream类的一个类实例,
        //就是把你遍历出来的每一个对象都用来去调用System.out（也就是PrintStream类的一个实例）的println方法

        //1相同. numbe.parallelStream().forEach(obj ->{
        //    System.out.println(obj);
        //   });
        //2相同. numbe.parallelStream().forEach(obj -> System.out.println(obj));
        System.out.println("=========================");

        //reduce 聚合操作
        Integer reduce = Stream.of(1, 2, 3, 4, 5).reduce((a, b) -> a + b).get();
        //int result = Stream.of(1,2,3,4,5).reduce(new BinaryOperator<Integer>() {
        //    @Override
        //       public Integer apply(Integer item1, Integer item2) {
        //                return item1 + item2;
        //   }
        //    }).get();

        //初始值方法 ---初始值100
        int value = Stream.of(1, 2, 3, 4,5).reduce(100, (sum, item) -> sum + item);

        //求最大值
        int value1 = Stream.of(1645, 234345, 32, 44434,564534,435,34343542,212).reduce( (item1, item2) -> item1 >
                item2 ? item1 : item2 ).get();
        System.out.println(value1);

        System.out.println("===================");
        Integer integer = Stream.of(1645, 234345, 32, 44434, 564534, 435, 34343542, 212).max((a, b) -> Integer.compare(a, b)).get();
        System.out.println(integer);

        System.out.println("foreanch==============================foreach");
        List<Student> results = Arrays.asList(new Student(32),new Student(33),new Student(21),new Student(29),new Student(18));
        //不能修改包含外部的变量的值
        //不能⽤break或者return或者continue等关键词结束或者跳过循环
        results.forEach(obj->{
            
            System.out.println(obj.toString());
        });
    }
}
