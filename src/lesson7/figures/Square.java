package lesson7.figures;

import lesson7.CircumcircleRadius;
import lesson7.FiguresSq;
import lesson7.figures.Point;
import lesson7.figures.Rectangle;

/**
 * Created by Radion on 28.02.2017.
 */
public class Square extends Rectangle implements FiguresSq, CircumcircleRadius {

    public Square(Point point1, Point point2) {
        super(point1, point2);
    }

    @Override
    public double figuresSq() {
        return Math.pow((findSideA()), 2);
    }

    public double RectanglesDiagonal() {
        return getPoint1().getDistanceTo(getPoint2());
    }

    @Override
    protected double findSideA() {
        return getPoint1().getDistanceTo(getPoint2());
    }

    @Override
    public double circumcircelRadius() {
        return findSideA() / Math.sqrt(2);
    }


    @Override
    public String toString() {
        return getClass().getName() + ":" + " point1 - [" + getPoint1().getX() + ";" + getPoint1().getY() + "];" + " point2 - [" + getPoint2().getX() + ";" + getPoint2().getY() + "] ";
    }
}
