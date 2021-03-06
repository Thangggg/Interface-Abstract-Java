package TH2;

public class ComparableCircle extends Circle implements Comparable{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(Object o) {
        if (getRadius() >((ComparableCircle)o).getRadius()) return 1;
        else if (getRadius() < ((ComparableCircle)o).getRadius()) return -1;
        else return 1;
    }
}
