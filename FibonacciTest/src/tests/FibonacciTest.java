package tests;

import fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @ParameterizedTest
    @CsvSource({
            " 1,   0",
            " 2,   1",
            " 3,   1",
            " 4,   2",
            " 5,   3",
            " 6,   5",
            " 7,   8",
            " 8,  13",
            " 9,  21",
            "10,  34",
            "11,  55",
            "12,  89",
            "13, 144"
    })
    void fibRecursive(int n, int expected) {
        assertEquals(expected, Fibonacci.fibRecursive(n));
    }

    @Test
    void fibRecursiveNegativeNumber() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibRecursive(-1)),
                () -> assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibRecursive(-10)),
                () -> assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibRecursive(-100))
        );
    }

    @ParameterizedTest
    @CsvSource({
            " 1,   0",
            " 2,   1",
            " 3,   1",
            " 4,   2",
            " 5,   3",
            " 6,   5",
            " 7,   8",
            " 8,  13",
            " 9,  21",
            "10,  34",
            "11,  55",
            "12,  89",
            "13, 144"
    })
    void fibIterative(int n, int expected) {
        assertEquals(expected, Fibonacci.fibIterative(n));
    }


    @Test
    void fibIterativeNegativeNumber() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibIterative(-1)),
                () -> assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibIterative(-10)),
                () -> assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibIterative(-100))
        );
    }
}