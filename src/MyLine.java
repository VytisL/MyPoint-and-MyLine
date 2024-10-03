public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginX(int x){
        this.begin.x = x;
    }
    public void setBeginY(int y){
        this.begin.y = y;
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndX(int x){
        this.end.x = x;
    }
    public void setEndY(int y){
        this.end.y = y;
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public void setBeginXY(int x, int y){
        this.begin.x = x;
        this.begin.y = y;
    }
    public void setEndXY(int x, int y){
        this.end.x = x;
        this.end.y = y;
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public double getLength(){
        return begin.distanceFromPoint(end);
    }
    public double  getGradient(){
        return Math.atan2((end.getY()-begin.getY()), (end.getX()-getBeginX()));
    }
}
