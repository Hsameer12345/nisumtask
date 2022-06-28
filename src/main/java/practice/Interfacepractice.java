package practice;

interface Interfacepractice {

    void engine();

}
class Car implements Interfacepractice{

    @Override
    public void engine() {
        System.out.println("I have car engine");
    }
}
class Bike implements Interfacepractice{

    @Override
    public void engine() {
        System.out.println("I have bike engine");
    }
}
