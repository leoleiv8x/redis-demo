package HanShuShi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer 消费型接⼝：有⼊参，⽆返回值
 * ⽤途： 因为没有出参，常⽤于打印、发送短信等消费动作
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
                System.out.println("2111111111111");
            }
        };

        //Consumer<String> consumer = obj->{
        //    System.out.println(obj);
        //    System.out.println("调⽤短信接⼝发送短信，或者打印⽇志");
        //};

        test("1111", consumer);

        //test("8889", new Consumer<String>() {
        //    @Override
        //    public void accept(String s) {
        //        System.out.println("2222222222222");
        //    }
        //});
        test("8889", s ->{
            System.out.println(s);
            System.out.println("11111111111");
        });

        List<String> list = Arrays.asList("aaa", "ddd");
        //list.forEach(new Consumer<String>() {
        //    @Override
        //    public void accept(String s) {
        //           ssout
        //    }
        //});
        System.out.println("=====================");
        list.forEach(obj->{
            System.out.println(obj);
        });
    }
    public static void test(String phone,Consumer<String> consumer){
        consumer.accept(phone);
    }
}
