//  Create a program that shows bitwise compliment of a number.

import java.util.Scanner;

public class Bitwisecompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to showcase of Not/Compliment Operator\n");
        System.out.println("Please inter your number: ");

        int num = input.nextInt();

        int result = ~num;   // telda asign

        System.out.println("Result is: " + result);
    }
    
}
