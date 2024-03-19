package lambda;

import java.util.function.Consumer;

public class PrintMultipleLambda {
    private static final int CYCLE_NUM = 3;

    private int calledTimes = 0;
    
    public Consumer<Integer> printMultiple = (n) -> {
        for (int i = 0; i < CYCLE_NUM; i++) {
            System.out.println(n);
        }
    };

    public Consumer<Integer> printAsManyAs = (n) -> {
        for (int i = 0; i < n; i++) {
            System.out.println(n);
        }
    };
    
    public Consumer<Integer> printIncreasingTimes = (n) -> {
        ++ calledTimes;
        for (int i = 0; i < calledTimes; i++) {
            System.out.println(n);
        }  
    };
}
