package calculation;

interface Calculatearea{

    void area();


}

 class Circle implements Calculatearea{
    double radius;
    Circle(double radius){
    this.radius = radius;
    }
     public void area() {
         double pi = 3.142;
         System.out.println("Area of a circle\n" + pi*radius*radius );

     }


 }
 class Triangle implements Calculatearea{
    double height;
    double width;
    Triangle(double height, double width){
        this.height = height;
        this.width = width;
    }   @Override
     public void area() {
        System.out.println(" Area of a rectangle\n" + width * height);

    }


 }
class Rectangle implements Calculatearea{
    float height;
    float width;
    Rectangle(float height, float width){
        this.height = height;
        this.width = width;
    }
     public void area(){
        System.out.println(" Area of a triangle \n" + height*width/2);

    }

}