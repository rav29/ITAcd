package lesson6;

/**
 * Created by Radion on 26.02.2017.
 */
public class Lesson6Main {
    public static void main(String[] args) {
        Point firstPoint = new Point(5,5);
        firstPoint.printDistance();

        Point leftTop = new Point(2, 7);
        Point rightBottom = new Point(9, 2);
        Rectangle rectangle = new Rectangle(leftTop, rightBottom);
        rectangle.printRectanglesDiagonal();
        rectangle.RectanglesSq();


    }
}
