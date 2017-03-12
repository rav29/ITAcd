package lesson7;

import lesson7.figures.*;

import java.sql.SQLClientInfoException;


/**
 * Created by Radion on 28.02.2017.
 */
public class lesson7 {
    public static void main(String[] args) {
        Point point1 = new Point(2,6);
        Point point2 = new Point(3,5);

        Circle circle = new Circle(point1, point2);
        EqualSidesTriangle equalSidesTriangle = new EqualSidesTriangle(point1, point2);
        Rectangle rectangle = new Rectangle(point1, point2);
        RightTriangle rightTriangle = new RightTriangle(point1, point2);
        Square square = new Square(point1, point2);
        Triangle triangle = new Triangle(point1, point2);

        System.out.println("Равны ли площади " + circle.isFiguresSqEquals(rectangle));

        ShapeUtils shapeUtils = new ShapeUtils();
        System.out.println("Является ли фигура прямоугольником " + shapeUtils.isFigureRectangle(circle));
        System.out.println("Является ли фигура треугольником " + shapeUtils.isFigureTriangle(rightTriangle));
        System.out.println(rectangle.toString());
    }
}
