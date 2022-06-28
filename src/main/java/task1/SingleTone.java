package task1;

class Singleton {

    public static void main(String args[]){

        SingletonTest oBj1 = SingletonTest.getInstance();
        SingletonTest oBj2 = SingletonTest.getInstance();

        if(oBj1 == oBj2) {
            System.out.println("Both object references are same");
        }

        }
}
    class SingletonTest {

    //Put it in the getInstance Method
    static SingletonTest object = new SingletonTest();

    private SingletonTest()
    {

    }
    public static SingletonTest getInstance(){

        return object;
    }
}

