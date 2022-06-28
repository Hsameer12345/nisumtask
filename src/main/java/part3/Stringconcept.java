package part3;

public class Stringconcept {
    public static void main(String args[]){

        String a =  "sameer";
        String b =  "sameer";
        String c = new String("sameer");
        String d = new String("sameer");
        System.out.println(a==b);
        System.out.println(d==a);
        System.out.println(c==d);
        System.out.println(c==c);
    }
}
