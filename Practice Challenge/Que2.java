//Create a program to add two numbers.

import java.util.Scanner;

public class Que2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Wlcome to calculator");
        System.out.print(" please inter your number: ");
        int firstNum = input.nextInt();
        System.out.print("please inter your second number: ");
        int SecondNum = input.nextInt();
        int sum = firstNum + SecondNum;
        System.out.println("sum of your number is: " + sum);


    }
}