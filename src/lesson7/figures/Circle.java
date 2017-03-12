package lesson7.figures;

import com.sun.org.apache.xpath.internal.SourceTree;
import lesson7.FiguresSq;

/**
 * Created by Radion on 28.02.2017.
 */
public class Circle extends Figure implements FiguresSq {

    public Circle(Point point1, Point point2) {
        super(point1, point2);
    }

    @Override
    public double figuresSq() {
        return Math.PI * Math.pow((getPoint1().getDistanceTo(getPoint2())), 2);
    }

    @Override
    public String toString() {
        return  getClass().getName() + ":" + " point1 - ["+ getPoint1().getX() + ";" + getPoint1().getY() +  "];" + " point2 - [" + getPoint2().getX() + ";" + getPoint2().getY()+"] ";
    }
}
