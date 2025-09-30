//Write a program to check if a given number is even or odd using bitwise operators.

import java.util.Scanner;

public class challenges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please inter your number ");
        int num = input.nextInt();

        if (( num & 1 )== 1) {
            System.out.println("Your number is Odd");
        } else {
            System.out.println("Your number is Even");
        }
        
    }
}
