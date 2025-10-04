//  Write a function that calculates the factorial of a given number.

import java.util.Scanner;

public class Factoria {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(" Welcome to Factorial calculator\n");
        System.out.print("Please inter your number: ");
        int num = inp.nextInt();
        long fact = factorials(num);
        System.out.println("Factorial is " + fact);
        
    }

    public static long factorials(int num) {
        if( num < 2) {
            return 1;
        }
        int fact = 1;
        int i = 2;
        while (i <= num) {
            fact = fact * i;

            i++;
            
        }
        return fact;

    }
}
