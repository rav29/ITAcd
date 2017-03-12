package lesson7.figures;

import lesson7.FiguresSq;

/**
 * Created by Radion on 05.03.2017.
 */
public class Triangle extends EqualSidesTriangle implements FiguresSq {
    private Point point3 = new Point(0, 0);

    public Triangle(Point point1, Point point2) {
        super(point1, point2);
        if (sideA() == sideB() + sideC() || sideB() == sideA() + sideC() || sideC() == sideA() + sideB()) {
            System.out.println("Треугольника с такими координатами не существует");
            return;
        }
    }

    @Override
    public double figuresSq() {
        return Math.sqrt(perimeter() * (perimeter() - sideA()) * perimeter() * (perimeter() - sideB()) * perimeter() * (perimeter() - sideC()));
    }

    @Override
    public double perimeter() {
        return sideA() + sideB() + sideC();
    }

    private double sideA() {
        return getPoint1().getDistanceTo(getPoint2());
    }

    private double sideB() {
        return getPoint2().getDistanceTo(getPoint3());
    }

    private double sideC() {
        return getPoint1().getDistanceTo(getPoint3());
    }

    public Point getPoint3() {
        return point3;
    }

    @Override
    public String toString() {
        return getClass().getName() + ":" + " point1 - [" + getPoint1().getX() + ";" + getPoint1().getY() + "];" + " point2 - [" + getPoint2().getX() + ";" + getPoint2().getY() + "]; " + " point3 - [" + getPoint3().getX() + ";" + getPoint3().getY() + "]";
    }

}
