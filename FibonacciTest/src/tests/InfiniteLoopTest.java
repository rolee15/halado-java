package tests;

import infinite.InfiniteLoop;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class InfiniteLoopTest {

    @Test
    @Timeout(5)
    void infinite() {
        InfiniteLoop.infinite();
    }

}