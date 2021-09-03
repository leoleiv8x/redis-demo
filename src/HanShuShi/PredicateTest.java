package HanShuShi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate: 断⾔型接⼝：有⼊参，有返回值，返回值类型确定是boolean
 * T：⼊参类型；出参类型是Boolean
 * 调⽤⽅法：boolean test(T t);
 * ⽤途： 接收⼀个参数，⽤于判断是否满⾜⼀定的条件，过滤数据
 */;
public class PredicateTest {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("awewrwe","vdssdsd","aoooo","psdddsd");

        //List<String> results = filter(list, new Predicate<String>() {
        //            @Override
        //            public boolean test(String s) {
        //                return s.startsWith("a");
        //            }
        //        };

        List < String > results = filter(list, obj -> obj.startsWith("a"));
        System.out.println(results);

    }

    public static List<String> filter(List<String> list, Predicate<String> predicate) {
        List<String> results = new ArrayList<>();
        for (String str : list) {
            if (predicate.test(str)) {
                results.add(str);
            }
        }
        return results;
    }
}
