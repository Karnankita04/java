import shapes.MyCircle;
import shapes.MyRectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("running");
        Main.showCircle();
        Main.showRectangle();
    }

    public static void showCircle() {
        int radius = 2;
        MyCircle circle = new MyCircle(radius);
        circle.draw();
    }

    public static void showRectangle() {
        int length = 4;
        int breadth = 2;
        MyRectangle rectangle = new MyRectangle(length,breadth);
        rectangle.draw();
    }
}