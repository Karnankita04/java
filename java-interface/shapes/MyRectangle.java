package shapes;

public class MyRectangle implements Shapes {
    private final int length;
    private final int breadth;

    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void draw(){
        System.out.printf("I am rectangle length = %d, breadth = %d\n",length,breadth);
    }
}
