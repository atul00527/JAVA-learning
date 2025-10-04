//   Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Wlcome to OddSum\n");
        System.out.print("Please inter your number: ");
        int num = inp.nextInt();
        int sum = oddSum(num);
        System.out.println("odd Sum till " + num + " is " + sum);
    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + i;
            i = i + 2;            
        }
        return sum;
    }
}
