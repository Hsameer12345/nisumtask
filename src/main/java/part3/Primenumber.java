package part3;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("****Enter the number****");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " : is prime number");
        } else {
            System.out.println(n + " : is not prime number");

        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }

        }
            return true;
    }
}
