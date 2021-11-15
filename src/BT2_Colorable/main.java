package BT2_Colorable;

public class main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Square(30,"đen",false);
        shape[1] = new Rectangle(20,10);
        shape[2] = new Circle(12);

        for (Shape shape1 : shape) {
            System.out.println(shape1.getArea());
           if(shape1 instanceof Colorable) {
               ((Colorable) shape1).howToColor();
           }
        }

        }

    }

