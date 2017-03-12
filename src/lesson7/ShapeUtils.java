package lesson7;

import lesson7.figures.*;

/**
 * Created by Radion on 28.02.2017.
 */
public class ShapeUtils {
    public static boolean isFigureRectangle(Figure figure) {                        //является ли прямоугольником
        Rectangle rectangle = new Rectangle(figure.getPoint1(), figure.getPoint2()); //можно через стравнение площадей
        return figure.figuresSq() == rectangle.figuresSq();
    }

    public static boolean isFigureTriangle(Figure figure) {
        RightTriangle rightTriangle = new RightTriangle(figure.getPoint1(), figure.getPoint2());
        EqualSidesTriangle equalSidesTriangle = new EqualSidesTriangle(figure.getPoint1(), figure.getPoint2());
        Triangle triangle = new Triangle(figure.getPoint1(), figure.getPoint2());
        if (figure.figuresSq() == rightTriangle.figuresSq()) {
            return true;
        } else if (figure.figuresSq() == equalSidesTriangle.figuresSq()) {
            return true;
        } else if (figure.figuresSq() == triangle.figuresSq()){
            return true;
        } else {
            return false;
        }

    }
}
