package HanShuShi;

import java.util.function.BiFunction;

/**
 * Function只能接收⼀个参数，如果要传递两个参数,则⽤ BiFunction
 */
public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bd = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };
        //bd.apply(10,20);
        System.out.println(operator(10,20,(a, b) -> a+b));
        System.out.println(operator(10,20,(a, b) -> a-b));
        System.out.println(operator(10,20,(a, b) -> a*b));
        System.out.println(operator(10,20,(a, b) -> a/b));

    }
    public static Integer operator(Integer a, Integer b, BiFunction<Integer,Integer,Integer> bf){
         return bf.apply(a, b);
    }
}
