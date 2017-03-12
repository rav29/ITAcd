package lesson7.figures;

import lesson7.FiguresSq;

/**
 * Created by Radion on 02.03.2017.
 */
public abstract class Figure implements FiguresSq {
    private Point point1;
    private Point point2;

    public Figure(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;

    }

    public boolean isFiguresSqEquals(Figure figure) {
        return this.figuresSq() == figure.figuresSq();
    }

    public boolean isFigureExists(Figure figure) {
        return getPoint1() != getPoint2();
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }
}
