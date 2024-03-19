package lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class PrimeLambda {

    private static int currentPrime = 2;

    public static Predicate<Integer> isPrime = (n) -> {
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    };

    public static Supplier<Integer> nextPrime = () -> {
        int p = currentPrime + 1;
        while (!isPrime.test(p)) {
            p++;
        }

        int retVal = currentPrime;
        currentPrime = p;
        return retVal;
    };
}
