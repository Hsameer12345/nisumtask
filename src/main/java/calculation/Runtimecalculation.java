package calculation;

public class Runtimecalculation {
    public static void main(String args[]) {



        Circle circle = new Circle(2.3);
        Triangle triangle = new Triangle(4.4, 3.4);
        Rectangle rectangle = new Rectangle(4, 6);
        circle.area();
        triangle.area();
        rectangle.area();
    }
}