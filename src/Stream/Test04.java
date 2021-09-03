package Stream;

import java.util.Arrays;
import java.util.List;

/**
 *allMatch函数 anyMatch函数
 */
public class Test04 {
    public static void main(String[] args) {

        //检查是否匹配所有元素，只有全部符合才返回true
        List<String> list = Arrays.asList("springboot", "springcloud", "redis",
                "git", "netty", "java", "html", "docker");
        boolean flag = list.stream().allMatch(obj->obj.length()>1);

        System.out.println(flag);
        //检查是否⾄少匹配⼀个元素
        boolean flag1 = list.stream().anyMatch(obj->obj.length()>18);
        System.out.println(flag1);
    }
}
