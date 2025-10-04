// Even Odd number find 

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inter your number: ");
        int num = input.nextInt();

        if ( num % 2 == 0 ){
            System.out.println("is your number: Even");
        }else {
            System.out.println("is your number Odd");
        }


    }
}
