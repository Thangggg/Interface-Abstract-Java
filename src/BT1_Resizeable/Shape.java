package BT1_Resizeable;

public abstract class Shape implements Resizeable {
    private String color = "green";
    private boolean filled = true;


    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "có màu : "
                + getColor()
                + " và "
                + (isFilled() ? "đã tô mầu" : "chưa được tô màu");
    }

    public static void printShape(Shape[] shape) {
        for (Shape x : shape) {
            System.out.println(x.toString());
        }
    }
}
