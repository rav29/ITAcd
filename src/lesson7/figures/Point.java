package lesson7.figures;

/**
 * Created by Radion on 02.03.2017.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getDistanceTo(Point point) {
        return Math.sqrt(Math.pow((this.x - point.getX()), 2) + Math.pow((this.y - point.getY()), 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }


    @Override
    public String toString() {
        return getClass().getName() + ":" + " point - [" + getX() + ";" + getY() + "]";
    }


}

