package src.PL.SDA.Java_Zaawansowana.Zadania.Dos;

public class Point {

    private float x;
    private float y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void getXY(float[] XY){
        XY[0] = getX();
        XY[1] = getY();
    }


    @Override
    public String toString() {
        return "(" + x + ", " + y +
                ")";
    }


}
