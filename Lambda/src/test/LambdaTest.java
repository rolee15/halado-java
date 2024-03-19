package test;

import lambda.IncreasingIntegersLambda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LambdaTest {

    @Test
    public void givenSameLambdaCalledMultipleTimes_ReturnsIncreasingIntegers() {
        var lambdaWrapper = new IncreasingIntegersLambda();

        assertEquals(1, lambdaWrapper.getInt());
        assertEquals(2, lambdaWrapper.getInt());
        assertEquals(3, lambdaWrapper.getInt());
    }

    @Test
    public void givenNewLambdaInstance_StateIsLost() {
        var lambdaWrapper = new IncreasingIntegersLambda();

        assertEquals(1, lambdaWrapper.getInt());
        assertEquals(2, lambdaWrapper.getInt());
        assertEquals(3, lambdaWrapper.getInt());
    }

    @Test
    public void givenNewLambdaOnEveryCall_StateIsLost() {
        var lambdaWrapper = new IncreasingIntegersLambda();

        assertEquals(1, lambdaWrapper.getIntNewLambda());
        assertEquals(1, lambdaWrapper.getIntNewLambda());
        assertEquals(1, lambdaWrapper.getIntNewLambda());
    }

    @Test
    public void givenLambdaOfLambdaIsReturned_StateIsPreserved() {
        var lambdaWrapper = new IncreasingIntegersLambda();

        assertEquals(1, lambdaWrapper.lambdaOfLambda().get());
        assertEquals(2, lambdaWrapper.lambdaOfLambda().get());
        assertEquals(3, lambdaWrapper.lambdaOfLambda().get());
    }

    @Test
    public void givenLambdaMember_StateIsPreserved() {
        var lambdaWrapper = new IncreasingIntegersLambda();

        assertEquals(1, lambdaWrapper.integerSupplier.get());
        assertEquals(2, lambdaWrapper.integerSupplier.get());
        assertEquals(3, lambdaWrapper.integerSupplier.get());
    }
}
