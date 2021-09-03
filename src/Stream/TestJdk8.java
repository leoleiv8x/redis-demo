package Stream;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 说明:⽅法引⽤是⼀种更简洁易懂的lambda表达式，操作符是双冒号::，⽤来直接访问类或者实例
 * 已经存在的⽅法或构造⽅法
 * 通过⽅法引⽤，可以将⽅法的引⽤赋值给⼀个变量
 * 语法：左边是容器（可以是类名，实例名），中间是" :: "，右边是相应的⽅法名
 * 静态⽅法，则是ClassName::methodName。如 Object ::equals
 * 实例⽅法，则是Instance::methodName
 * 构造函数，则是 类名::new;
 * 单个参数
 * Function<⼊参1, 返回类型> func = ⽅法引⽤
 * 应⽤ func.apply(⼊参);
 * 2个参数
 * BiFunction<⼊参1,⼊参2, 返回类型> func = ⽅法引⽤
 * 应⽤ func.apply(⼊参1,⼊参2);
 */
public class TestJdk8 {
    public static void main(String[] args) {

        // 使⽤双冒号::来构造静态函数引⽤
        Function<String, Integer> fun = Integer::parseInt; //valueof 返回包装类
        Integer value = fun.apply("1024");
        System.out.println(value);

        // 使⽤双冒号::来构造⾮静态函数引⽤
        String content = "欢迎来到⼩滴课堂学习";
        Function<Integer, String> func = content::substring;
        String result = func.apply(1);
        System.out.println(result);

        // 构造函数引⽤，多个参数
        BiFunction<String, Integer, User1> biFunction = User1::new;
        User1 user1 = biFunction.apply("⼩滴课堂", 28);
        System.out.println(user1.toString());
        //构造函数引⽤，单个参数
        Function<String, User1> function = User1::new;
        User1 user2 = function.apply("⼩D");
        System.out.println(user2.toString());

        // 函数引⽤也是⼀种函数式接⼝，可以将函数引⽤作为⽅法的参数
        sayHello(String::toUpperCase, "xdclass.net");
    }
    /**
     * @param func 函数引⽤
     * @param param 对应的参数
     */
    private static void sayHello(Function<String, String> func, String
            param) {
        String result = func.apply(param);
        System.out.println(result);
    }
}

class User1 {
    private String username;
    private Integer age;
    public User1() {
    }

    @Override
    public String toString() {
        return "User1{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public User1(String username) {
        this.username = username;
    }
    public User1(String username, Integer age) {
        this.username = username;
        this.age = age;
    }
}
