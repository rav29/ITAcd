package lesson7.figures;

import lesson7.CircumcircleRadius;
import lesson7.FiguresSq;

/**
 * Created by Radion on 28.02.2017.
 */
public class EqualSidesTriangle extends Figure implements FiguresSq, CircumcircleRadius {

    public EqualSidesTriangle(Point point1, Point point2) {
        super(point1, point2);
    }

    @Override
    public double figuresSq() {
        return Math.sqrt(3) / 4 * Math.pow(sideOfTriangel(), 2);
    }

    public double perimeter() {
        return sideOfTriangel() * 3;
    }

    @Override
    public double circumcircelRadius() {
        return Math.sqrt(3) / 3 * sideOfTriangel();
    }

    private double sideOfTriangel() {
        return getPoint1().getDistanceTo(getPoint2());
    }


    @Override
    public String toString() {
        return getClass().getName() + ":" + " point1 - [" + getPoint1().getX() + ";" + getPoint1().getY() + "];" + " point2 - [" + getPoint2().getX() + ";" + getPoint2().getY() + "] ";
    }
}
