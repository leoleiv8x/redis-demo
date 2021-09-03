import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * lambda表达式
 * 前提：接口只有一个方法(自己特有的)
 * (params) -> expression
 * 1.括号中的参数类型可以省略不写；
 * 2. 括号中的参数只有⼀个，那么参数类型和()都可以省略不写
 * 3.如果{}中的代码只有⼀⾏，⽆论有返回值，可以省略{}，return，分号，要⼀起省略，其他则需要加上。
 */
public class Test3Lam {
    public static void main(String[] args) {
        //    new Thread(new Runnable(){
        //
        //        @Override
        //        public void run() {
        //            System.out.println("线程111111111111111111");
        //        }
        //    }).start();
        //}
        new Thread(() -> System.out.println("线程1")).start();

        new Thread(() ->{
            System.out.println();
            System.out.println();
        }).start();
       List<String> list = Arrays.asList("aaa", "fff", "ggg");
        //Collections.sort(list, new Comparator<String>() {
        //    @Override
        //    public int compare(String a, String b) {
        //        return b.compareTo(a);
        //    }
        //});
        Collections.sort(list, (a,b)->b.compareTo(a));
        for (String l : list){
            System.out.println(l);
        }


    }
}