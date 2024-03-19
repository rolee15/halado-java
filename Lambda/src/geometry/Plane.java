package geometry;

import java.util.function.Supplier;

public class Plane {

    static Point currentPoint = new Point();

    public static Supplier<Point> nextPoint = () -> {
        var p = currentPoint;
        if (p.getX() == p.getY()) {
            p = new Point(p.getX() + 1, p.getY());
        }
        else {
            p = new Point(p.getX(), p.getY() + 1);
        }

        var retPoint = currentPoint;
        currentPoint = p;
        return retPoint;
    };
}
