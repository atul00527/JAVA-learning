// Create a program to find the Least Common Multiple (LCM) of two numbers.

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
        System.out.println(" Welcome to LCM\n");
        System.out.print("Please inter your first number: ");
        int first = inp.nextInt();
        System.out.print("Please inter your second number: ");
        int second = inp.nextInt();
        int lcm = lcm(first,  second);
        System.out.println(lcm);
    }
    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if(factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}
