package BT1_Resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5,"red", false);
        shapes[1] = new Square(10, "black", true);
        shapes[2] = new Rectangle(15, 20, "yellow", false);

        for (Shape shape: shapes) {
            System.out.println(shape);
        }

        for (Shape shape: shapes){
            shape.resize(Math.random()*100);
        }
        Shape.printShape(shapes);
    }
}
