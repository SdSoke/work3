/**
 * Created by admin on 2016/10/27.
 */

public class Square extends Shape {

    private double height ;

    public Square(double height) {
        this.height = height;
    }

    //@Override
    public double getArea() {
        return (this.height * this.height);
    }
}