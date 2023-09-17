package baiTap.interfaceResizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3,5);
        for (Shape shape: shapes) {
            if(shape instanceof Resizeable){
                System.out.println(((Resizeable) shape).resize(Math.round(Math.random()*101+1)));
            }
        }
    }
}
