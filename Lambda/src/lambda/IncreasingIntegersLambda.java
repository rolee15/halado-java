package lambda;

import java.util.function.Supplier;

public class IncreasingIntegersLambda {

    private int n = 1;
    public Supplier<Integer> integerSupplier = () -> n++;

    public Integer getInt() {
        return ((Supplier<Integer>)(() -> n++)).get();
    }

    public Integer getIntNewLambda() {
        return new Supplier<>() {
            int n = 1;
            @Override
            public Integer get() {
                return n++;
            }
        }.get();
    }

    public Supplier<Integer> lambdaOfLambda() {
        return () -> n++;
    }
}
