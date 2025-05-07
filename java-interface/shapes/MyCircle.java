package shapes;

public class MyCircle implements Shapes {
    public int radius;

    public MyCircle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("I am Circle with radius = %d\n",radius);
    }
}