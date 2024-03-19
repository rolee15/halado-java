package test;

import lambda.PrimeLambda;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeLambdaTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 97})
    public void GivenPrimeNumbers_IsPrimeReturnsTrue(int n) {
        assertTrue(PrimeLambda.isPrime.test(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 9, 15, 18, 45, 99})
    public void GivenNotPrimeNumbers_IsPrimeReturnsFalse(int n) {
        assertFalse(PrimeLambda.isPrime.test(n));
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 3, 5, 7, 11, 13, 17, 19})
    public void asd(int n) {
        assertEquals(n, PrimeLambda.nextPrime.get());
    }
}
