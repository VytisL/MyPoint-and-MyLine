public class TestMyLine {
    public static void main(String[] args) {


        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine l1   = new MyLine(p1, p2);
        System.out.println(l1);

        System.out.println("Line 2 length: " + l1.getLength());
        System.out.println("Line 2 gradient: " + l1.getGradient());
    }
}
