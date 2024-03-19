package test;

import geometry.Plane;
import geometry.Point;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class GeometryTest {

    @ParameterizedTest
    @MethodSource("testPointsProvider")
    public void testPoints(Point p) {
        assertEquals(p, Plane.nextPoint.get());
    }

    private static List<Point> testPointsProvider() {
        return Arrays.asList(
                new Point(),
                new Point(1, 0),
                new Point(1, 1),
                new Point(2, 1),
                new Point(2, 2),
                new Point(3, 2),
                new Point(3, 3)
        );
    }
}
