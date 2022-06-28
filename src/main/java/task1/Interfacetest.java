package task1;

public class Interfacetest {
public static void main(String args[]){
     ElectricVehical electricVehical = new Electriccar();
     electricVehical.getEngine();


     }
}
interface ElectricVehical{

     String getEngine();
     String getBody();
     Integer getWheels();
     String getColor();
     Integer getCapacity();
     void setEngine(String engine);



}
class Electriccar implements ElectricVehical {
    String engine;

    @Override
    public String getEngine() {
        System.out.println("1500cc");
        return engine;
    }

    @Override
    public String getBody() {
        System.out.println("sedan");
        return null;
    }

    @Override
    public Integer getWheels() {
        System.out.println(4);
        return null;
    }

    @Override
    public String getColor() {
        System.out.println("blue");
        return null;
    }

    @Override
    public Integer getCapacity() {
        System.out.println(4);
        return null;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }
}
/*class Electricbike implements ElectricVehical {

    String engine = null;
    String body =  null;
    String wheels = null;
    String color = null;
    String capacity = null;
    String getEngine();
    String getBody();
    Integer getWheels();
    String getColor();
    Integer getcapacity();

    @Override
    public String getEngine() {
        return null;
    }

    @Override
    public String getBody() {
        return null;
    }

    @Override
    public Integer getWheels() {
        return null;
    }

    @Override
    public String getColor() {

        return null;
    }

    @Override
    public Integer getCapacity() {
        return null;
    }
}
}
/*class Bike implements ElectricVehical {

   /* public Bike(String engine, String body, Integer wheels, String color, Integer capacity){
        this.engine = engine;
        this.body = body;
        this.wheels = wheels;
        this.color = color;
        this.capacity = capacity;

    }
    public String getEngine() {
        return this.engine;
    }
    public String getBody(){
        return this.body;
    }

    @Override
    public Integer getWheels() {
        return null;
    }

    public String getWheel(){
        return this.wheels;
    }
    public String getColor(){
        return this.color;
    }
    public String getCapacity(){
        return this.capacity;
    }

  //  void getDetails() {
    //    System.out.println("**** Bike Specifications ****");
      //  System.out.println("Engine Type " + getEngine() + "\nBody Type " + getBody() + "\nWheels " +
        //        getWheel() + "\nColor " + getColor() + "\nCapacity " + getCapacity());

    }
//}

 */