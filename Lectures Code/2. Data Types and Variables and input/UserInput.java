import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pleasr inter your name: ");
        String name = input.nextLine();
        System.out.print("Good morning: ");
        System.out.println(name + " also tell me your age ");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);
    }
}
