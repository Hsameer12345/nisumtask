package part4;

import java.util.Scanner;

public class Exaptionhandling {
    public static void main(String[] args) {

    try {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int n1 = input.nextInt();
        System.out.println("Enter the second number");
        int n2 = input.nextInt();

        int sum = n1%n2;
        System.out.println(sum);
    } catch (Exception e) {
        System.out.println("Invalid value");
    }
}
}


