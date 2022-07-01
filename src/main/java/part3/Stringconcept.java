package part3;

public class Stringconcept {
    public static void main(String args[]){

        String a =  "sameer";
        String b =  "sameer";
        String c = new String("sameer");
        String d = new String("sameer");
        c = c.concat(" khan");
        System.out.println(a.equals(b));
        System.out.println(d==a);
        System.out.println(c.equals(b));
        System.out.println(c==b);
        System.out.println(c);

    }
}
