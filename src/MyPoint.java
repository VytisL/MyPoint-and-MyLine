import java.sql.Array;

public class MyPoint {
    public int x;
    public int y;

    public MyPoint(){

    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;

    }
    public int[] getXY(){
        int[] array = new int[2];
        array[0] = x;
        array[1] = y;
        return array;
    }
    public double distance(int x, int y){
        double a = x;
        double b = y;
        double a1 = getX();
        double b1 = getY();
        double dist = Math.sqrt((Math.pow((a1-a),2))+(Math.pow((b1-b),2)));
        return dist;
    }
    public double distanceFromPoint(MyPoint point){
        double a = point.getX();
        double b = point.getY();
        double a1 = getX();
        double b1 = getY();
        double dist = Math.sqrt((Math.pow((a1-a),2))+(Math.pow((b1-b),2)));
        return dist;
    }
    public double distanceFromZero(){
        double a1 = getX();
        double b1 = getY();
        double dist = Math.sqrt((Math.pow(a1,2))+(Math.pow(b1,2)));
        return dist;
    }


    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}

