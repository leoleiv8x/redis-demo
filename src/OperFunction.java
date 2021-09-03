/**
 * 函数时接口
 * @param <R>
 * @param <T>
 */
@FunctionalInterface
public interface OperFunction<R,T> {
    R operator(T t1, T t2);
}