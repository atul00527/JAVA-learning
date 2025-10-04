//Develop a program that prints the multiplication table for a given number.

import java.util.Scanner;

public class multiplication{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(" Welcome to multiplication of the number\n");
        System.out.print("Please inter your number: ");
        int num = inp.nextInt();
        multiplicationNumber(num);
    }

    public static void multiplicationNumber(int num) {
        int i = 1;
        while (i <= 10) { 
            System.out.println(num + " X " + i + "=" + (num * i));
            i++;
            
        }

    }
}