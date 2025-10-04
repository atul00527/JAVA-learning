import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wlcome to Leap Year");
        System.out.print("Please inter your number ");

        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.print("Your year is a leap year");
        } else if (year % 100 == 0) {
            System.out.print("Your year is a leap year");
        } else if (year % 4 == 0) {
            System.out.print("Your year is a leap year");
        } else {
            System.out.println("Your year is not leap year");

        }
    }
    
}
