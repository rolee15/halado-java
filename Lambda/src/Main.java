import lambda.PrintMultipleLambda;

public class Main {

    public static void main(String[] args) {
        var printMultiple = new PrintMultipleLambda();
        printMultiple.printMultiple.accept(10);

        System.out.println();

        printMultiple.printAsManyAs.accept(5);

        System.out.println();

        printMultiple.printIncreasingTimes.accept(1);
        System.out.println();
        printMultiple.printIncreasingTimes.accept(1);
        System.out.println();
        printMultiple.printIncreasingTimes.accept(1);
    }
}
