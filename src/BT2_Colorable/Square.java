package BT2_Colorable;

public class Square extends Shape implements Colorable{
    private double side;

    public Square() {
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }




    @Override
    public String toString() {
        return "Hình vuông có cạnh ="
                + getSide()
                + ",  "
                + super.toString()
                + ", Diện tích =" +
                + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
