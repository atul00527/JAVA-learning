import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please inter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println(" aap eligible hai");
        }else {
            System.out.println(" eligible nhi ho ");
        }
    }
}
