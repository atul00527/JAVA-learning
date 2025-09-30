import java.util.Scanner;


public class PositiveNigativeNum {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Inter your number: ");
        int num = input.nextInt();
        
        if (num > 0) {
            System.out.println("your number is Positive");
        } else if ( num == 0 ) {
            System.out.print("your number is zero");
        }else {
            System.out.println("you number is negitive");
        }

        
    }
}

//  Create a program that determines if a number is positive, negative, or zero.