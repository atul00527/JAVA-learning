 // Create a program that shows bitwise XOR of two numbers.

import java.util.Scanner;

public class BitwiseXor {

    public static void main(String[] args) {
        Scanner wise = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR operators\n");
        System.out.print("Please inter your nummber: ");
        int first = wise.nextInt();

        System.out.print("Please inter your second number ");
        int second = wise.nextInt();

        int result = first ^ second;

        System.out.println("Result is " + result);
    }
}