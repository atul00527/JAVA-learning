import java.util.Scanner;

public class returnFunction {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();
        
        int sum = first + second;
        System.out.println(" sum of your number: " + sum);
        
        
        
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Inter  your first number: ");
        int number = input.nextInt();
        return number;
    }

    public static void greet() {
        System.out.print("Wlcome to JAVA learning Program\n");

    }

    
}