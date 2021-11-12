package BT1_Resizeable;

public class Main {
    public static void main(String[] args) {
        int number = (int) Math.floor(Math.random()*100);
        int number1 = (int) Math.floor(Math.random()*100);
        int number2 = (int) Math.floor(Math.random()*100);
        int number3 = (int) Math.floor(Math.random()*100);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(number1,"red", false);
        shapes[1] = new Square(number2, "black", true);
        shapes[2] = new Rectangle(number3, number, "yellow", false);

        for (Shape shape: shapes) {
            System.out.println(shape);
        }

        for (Shape shape: shapes){
            shape.resize(Math.random()*100);
        }
        Shape.printShape(shapes);
    }
}
