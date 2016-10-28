/**
 * Created by admin on 2016/10/27.
 */
public class Triangle extends Shape {
    private double a;

    private double b;

    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {

        return (a * h / 2);
    }
}

