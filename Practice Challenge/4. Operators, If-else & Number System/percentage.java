import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner percent = new Scanner(System.in);
        System.out.println("Wlcome to Grade calculate\n");
        System.out.print("Please inter your number: ");

        int percentage = percent.nextInt();

        if(percentage >=90) {
            System.out.print("You have a grade - A");
        } else if (percentage >= 75) {
            System.out.print("You have a grade - B");
        } else if (percentage >= 60) {
            System.out.print("You have a grade - C");
        } else if (percentage >= 30) {
            System.out.print("You have a grade - D");
        } else {
            System.out.println(" you have a faild ");
        }
    }
    
}
