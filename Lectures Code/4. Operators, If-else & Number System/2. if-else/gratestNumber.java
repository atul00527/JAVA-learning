import java.util.Scanner;

public class gratestNumber {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("Inter your first number: ");
        int firstNum = input.nextInt();
        System.out.print("Intr your second number: ");
        int secondNum = input.nextInt();
        System.out.print("Intr your third number: ");
        int thirdtNum = input.nextInt();

        if (firstNum >= secondNum && firstNum >= thirdtNum) {
            System.out.println(firstNum + "is gratest num");
        }
        else if (secondNum >= thirdtNum && secondNum >= firstNum) {
            System.out.println(secondNum + "is gratest num");
        }
        else {
            System.out.println("is gratest num");
        }
    }
}


// Create a program that determines the greatest of the three numbers.
 