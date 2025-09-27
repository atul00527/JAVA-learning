//Create a program to input name of the person and respond with ”Welcome to java classes” 


import java.util.Scanner;
public class Que{
    public static void main(String[] args) {
        System.out.print("please inter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Wlcome to Java classes " + name);
    }
}