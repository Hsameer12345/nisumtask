package task1;

import java.awt.*;

public class Inheritance {
    public static void main(String args[]){
        Car honda = new Car("3400cc ", "suv ", 4, "Silver", true,7);
        honda.getDetails();
        Car mehran = new Car("1500cc", "Hatch back", 4,"Blue", false, 5);
        mehran.getDetails();
        Car toyota = new Car("1500cc", "sedan", 4,"Black", true, 5);
        toyota.getDetails();
        Bike suzuki = new Bike("150cc","bendit", 2, "red", 3);
        suzuki.getDetails();

        Vehicle vehicle = new Car("3400cc ", "suv ", 4, "Silver", true,7);
        vehicle.polymophism();

    }
}

abstract class Object {

}

//change name to Vehicle
abstract class Vehicle extends Object{
    String engine;
    String body;
    Integer wheels;
    String color;
    Integer capacity;

    abstract void getDetails();
    void polymophism() {
        System.out.println("I am Vehicle");
    }
}

class Car extends Vehicle {
    Boolean isAC;

    public Car(String engine, String body, Integer wheels, String color, Boolean isAC, Integer capacity) {
        this.engine = engine;
        this.body = body;
        this.wheels = wheels;
        this.color = color;
        this.isAC =isAC;
        this.capacity = capacity;

    }

    public String getEngine() {
        return this.engine;
    }
    public String getBody(){
        return this.body;
    }
    public Integer getWheel(){
        return this.wheels;
    }
     public String getColor(){
        return this.color;
     }
     public Boolean getIsAC(){
        return this.isAC;
     }
     public Integer getCapacity(){
        return this.capacity;
     }

    @Override
    void getDetails() {
        System.out.println("**** Car Specifications ****");
        System.out.println("Engine Tyoe "+ getEngine()+ "\nBody Type "+ getBody()+ "\nWheels "+
                getWheel()+ "\nColor "+ getColor() + "\nCapacity "+ getCapacity());
        System.out.println(getIsAC() ? "Has AC":"No AC");
//        if (isAC){
//            System.out.println("Has Ac");
//        }else {
//            System.out.println("No Ac");
//        }
    }

    @Override
    void polymophism() {
        System.out.println("I am a car");
    }
}
//change name to Car and add Bike too
class Bike extends Vehicle {

    public Bike(String engine, String body, Integer wheels, String color, Integer capacity) {
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
    public Integer getWheel(){
        return this.wheels;
    }
    public String getColor(){
        return this.color;
    }
    public Integer getCapacity(){
        return this.capacity;
    }

    void getDetails() {
        System.out.println("**** Bike Specifications ****");
        System.out.println("Engine Type " + getEngine() + "\nBody Type " + getBody() + "\nWheels " +
                getWheel() + "\nColor " + getColor() + "\nCapacity " + getCapacity());

    }

    @Override
    void polymophism() {
        System.out.println("I am a bike");
    }
}