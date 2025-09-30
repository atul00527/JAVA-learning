// Create a program that shows bitwise OR of two numbers.

import java.util.Scanner;

public class BitwiseOr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Or operators\n");
        System.out.print("Please inter your nummber: ");
        int first = input.nextInt();

        System.out.print("Please inter your second number ");
        int second = input.nextInt();

        int result = first | second;

        System.out.println("Result is " + result);
    }
}
