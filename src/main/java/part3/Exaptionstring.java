package part3;


public class Exaptionstring {


    public static void main(String[] args) {

        String str1=null;

        try {
            System.out.println(str1.length());

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
}
