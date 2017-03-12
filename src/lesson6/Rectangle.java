package lesson6;

/**
 * Created by Radion on 26.02.2017.
 */
public class Rectangle {


    private Point leftTop;
    private Point rightBottom;

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }
    public void RectanglesSq() {
        System.out.println("Площадь прямоуголника: " + (findSideA() * findSideB()));
    }

    public void printRectanglesDiagonal() {
        System.out.println("Диагональ прямоуголника: " + (Math.sqrt(Math.pow(findSideA(), 2) + Math.pow(findSideB(), 2))));
    }
    private double findSideA() {
        return Math.max(leftTop.getY(), rightBottom.getY()) - Math.min(leftTop.getY(), rightBottom.getY());
    }

    private double findSideB() {
        return Math.max(leftTop.getX(), rightBottom.getX()) - Math.min(leftTop.getX(), rightBottom.getX());
    }


}
