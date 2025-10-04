//Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%).

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wlome to Airthmatic calculator");
        System.out.print("Please inter your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Please inter your Second number: ");
        int secondNumber = input.nextInt();
        

        int add = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.println("Additional is " + add);
        System.out.println("subtract is " + sub);
        System.out.println("multiply is " + mul);
        System.out.println("division is " + div);
        System.out.println("modules is " + mod);


    }

    
}




















