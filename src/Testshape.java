/**
 * Created by admin on 2016/10/27.
 */
public class Testshape {
    public static void main(String[] args) {

        Shape square = new Square(3);
        System.out.println(square.getArea());

        Shape circle=new Circle(3);
        System.out.println(circle.getArea());

        Shape triangle=new Triangle(2,4);
        System.out.println(triangle.getArea());

    }
}

