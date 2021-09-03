package HanShuShi;

import java.util.function.Function;

public class FunctionObj implements Function {

    @Override
    public Object apply(Object o) {
        return o + "经过apply处理拼接上了";
    }
}
