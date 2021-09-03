import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * ::
 */
public class TestJdk8 {
    public static void main(String[] args) {
        // 使⽤双冒号::来构造静态函数引⽤ Integer.parseInt();
        Function<String, Integer> fun = Integer::parseInt;
        Integer value = fun.apply("1024");
        System.out.println(value);

        // 使⽤双冒号::来构造⾮静态函数引⽤
        String content = "欢迎来到⼩滴课堂学习";
        Function<Integer, String> func = content::substring;
        String result = func.apply(1);
        System.out.println(result);

        // 构造函数引⽤，多个参数
        BiFunction<String, Integer, User> biFunction = User::new;
        User user1 = biFunction.apply("⼩滴课堂", 28);
        System.out.println(user1.toString());
        //构造函数引⽤，单个参数
        Function<String, User> function = User::new;
        User user2 = function.apply("⼩D");
        System.out.println(user2.toString());

        // 函数引⽤也是⼀种函数式接⼝，可以将函数引⽤作为⽅法的参数
        sayHello(String::toUpperCase, "xdclass.net");
    }
    /**
     *
     * @param func 函数引⽤
     * @param param 对应的参数
     */
    private static void sayHello(Function<String, String> func, String
            param) {
        String result = func.apply(param);
        System.out.println(result);
    }
}


class User {
    private String username;
    private Integer age;
    public User() {

    }
    public User(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }
}