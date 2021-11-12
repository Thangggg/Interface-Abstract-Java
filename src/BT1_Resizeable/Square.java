package BT1_Resizeable;

public class Square extends Shape{
    private double side;

    public Square() {
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


    double getArea() {
        return side * side;
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
    public void resize(double percent) {
        this.side *= (percent / 100);
    }
}
