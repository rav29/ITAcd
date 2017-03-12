package lesson7.figures;

import lesson7.CircumcircleRadius;
import lesson7.FiguresSq;

/**
 * Created by Radion on 28.02.2017.
 */
public class RightTriangle extends Rectangle implements FiguresSq, CircumcircleRadius {


    public RightTriangle(Point point1, Point point2) {  // прямоугольный треугольник
        super(point1, point2);                          //построенный по гипотенузе
    }

    @Override
    public double figuresSq() {
        return findSideA() * findSideB() / 2;
    }

    @Override
    public double circumcircelRadius() {
        return getPoint1().getDistanceTo(getPoint2()) / 2;
    }


    @Override
    public String toString() {
        return getClass().getName() + ":" + " point1 - [" + getPoint1().getX() + ";" + getPoint1().getY() + "];" + " point2 - [" + getPoint2().getX() + ";" + getPoint2().getY() + "] ";
    }
}
