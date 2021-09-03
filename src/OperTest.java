import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 自定义lambda
 */
public class OperTest {
    public static void main(String[] args) throws Exception {

        operator(20, 5, (x,  y) -> {
            return x * y;
        });
        operator(20, 5, new OperFunction<Integer, Integer>() {
            @Override
            public Integer operator(Integer t1, Integer t2) {
                return t1-t2;
            }
        });

        System.out.println(operator(20, 5, (x, y) -> x + y));
        System.out.println(operator(20, 5, (x, y) -> x - y));
        System.out.println(operator(20, 5, (x, y) -> x / y));
    }
    public static Integer operator(Integer x, Integer y, OperFunction<Integer, Integer> of) {
        return of.operator(x, y);
    }
}
