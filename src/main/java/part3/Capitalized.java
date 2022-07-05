package part3;

import java.util.Locale;
import java.util.Scanner;

public class Capitalized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =  scanner.next();
        String firstltr = input.substring(0,1);
        String ltr = input.substring(1);

        firstltr = firstltr.toUpperCase();

        String capitalizeFirstLetter = firstltr + ltr;


        System.out.println(capitalizeFirstLetter);



    }
}
