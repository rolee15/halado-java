package fibonacci;

public class Fibonacci {

    public static int fibRecursive(int n) {
        if (n < 1) throw new IllegalArgumentException("Parameter must be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;

        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static int fibIterative(int n) {
        if (n < 1) throw new IllegalArgumentException("Parameter must be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;

        int prev1 = 0;
        int prev2 = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = prev1;
            prev1 = prev2;
            prev2 = tmp + prev1;
        }
        return prev2;
    }
}
