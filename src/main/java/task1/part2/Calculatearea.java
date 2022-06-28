package task1.part2;

public class Calculatearea {


    public static void main(String args[]) {

        calculateArea(2);
        calculateArea(3,4);
        calculateArea(5.5,4);

    }

    public static void calculateArea(double radius) {
        double pi = 3.142;
        System.out.println("Area of a circle\n" + pi*radius*radius );

    }
    public static void calculateArea(double height, double width){
        System.out.println(" Area of a rectangle\n" + width*height);

    }
    public static void calculateArea(float height, float width ){
        System.out.println(" Area of a triangle \n" + height*width/2);

    }




    }







