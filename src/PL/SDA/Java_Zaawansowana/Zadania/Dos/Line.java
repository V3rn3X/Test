package src.PL.SDA.Java_Zaawansowana.Zadania.Dos;
import static  java.lang.Math.sqrt;
import static  java.lang.Math.pow;
import java.util.regex.Pattern;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point firstPoint, Point secondPoint) {
        this.point1 = firstPoint;
        this.point2 = secondPoint;
    }


    public float getDistance() {
        return (float) sqrt(pow(point2.getX() - point1.getX(), 2) + (pow(point2.getY() - point1.getY(), 2)));
    }
}


