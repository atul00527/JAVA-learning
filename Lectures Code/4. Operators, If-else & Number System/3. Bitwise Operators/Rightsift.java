//  Create a program that shows use of left shift operator.


import java.util.Scanner;

public class Rightsift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to showcase of Rightsift Operator\n");
        System.out.print("Please inter your number: ");

        int num = input.nextInt();

        int result = num >> 1;  

        System.out.println("Result is: " + result);
    }
    
}
