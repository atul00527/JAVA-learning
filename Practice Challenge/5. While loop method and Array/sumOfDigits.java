//  Create a program that computes the sum of the digits of an integer.

import java.util.Scanner;

public class sumOfDigits {
        public static void main(String[] args) {
            
            Scanner inp = new Scanner(System.in);
            System.out.println(" Welcome to sum of digits\n");
            System.out.print("Please inter your number: ");
            int num = inp.nextInt();
            int sum = sumOfDigits(num);
            System.out.println("Sum of Your number: " + sum);
            
        }
        public static int sumOfDigits(int num) {
            int sum = 0;
            while (num > 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }
            return sum;
        }
}
