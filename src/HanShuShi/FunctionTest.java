package HanShuShi;

import java.util.function.Function;

/**
 *Function<T, R> : 函数型接⼝：有⼊参，有返回值
 *   R apply(T t);
 */
public class FunctionTest {
    public static void main(String[] args) {
        //test("yinletian",new FunctionObj()); 已经重写
        //Function<Integer, Integer> func = new Function(){
        //    @Override
        //    public Object apply(Object p) {
        //        //system.out.println("我是函数");
        //        return (Integer)p*100;
        //    }
        //};
        //System.out.println( func.apply(10));
        //Function<Integer, Integer> func1 = p ->{
        //    System.out.println();
        //    return p*100;
        //};
        Function<Integer, Integer> func1 = p ->p*100; //无输出语句
        System.out.println(func1.apply(10));


    }
    public static void test(String input, Function function){
        System.out.println( function.apply(input));
    }
}
