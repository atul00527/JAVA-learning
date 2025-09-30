//  Create a program that shows use of left shift operator.


import java.util.Scanner;

public class Leftsift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to showcase of Leftsift Operator\n");
        System.out.print("Please inter your number: ");

        int num = input.nextInt();

        int result = num << 12;   // telda asign

        System.out.println("Result is: " + result);
    }
    
}
