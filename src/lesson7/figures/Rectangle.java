package lesson7.figures;

/**
 * Created by Radion on 28.02.2017.
 */
public class Rectangle extends Figure {

    public Rectangle(Point point1, Point point2) {
        super(point1, point2);
    }

    @Override
    public double figuresSq() {
        return findSideA() * findSideB();
    }

    public double figuresDiagonal() {
        return getPoint1().getDistanceTo(getPoint2());
    }

    protected double findSideA() {
        return Math.max(getPoint1().getY(), getPoint2().getY()) - Math.min(getPoint1().getY(), getPoint2().getY());
    }

    protected double findSideB() {
        return Math.max(getPoint1().getX(), getPoint2().getX()) - Math.min(getPoint1().getX(), getPoint2().getX());
    }


    @Override
    public String toString() {
        return getClass().getName() + ":" + " point1 - [" + getPoint1().getX() + ";" + getPoint1().getY() + "];" + " point2 - [" + getPoint2().getX() + ";" + getPoint2().getY() + "] ";
    }
}