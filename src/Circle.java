/**
 * Created by admin on 2016/10/27.
 */
public class Circle extends Shape {
    private double r;
    private final static double Pi = 3.14;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        return (Pi * r * r);
    }
}