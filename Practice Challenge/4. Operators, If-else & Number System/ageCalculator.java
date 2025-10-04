import java.util.Scanner;

public class ageCalculator {
    public static void main(String[] args) {
        Scanner Ager = new Scanner(System.in);
        System.out.println("Welcome to age Below\n");
        System.out.print("Inter your Age: ");

        int ageBelow = Ager.nextInt();

        if (ageBelow <= 13) {
            System.out.println(" You have a child ");
        } else if (ageBelow <= 60) {
            System.out.println(" You have a Teen ");
            
        }else if (ageBelow <= 80) {
            System.out.println(" You have a Adult ");
         
        } else {
            System.out.println(" You have a Aboow");
        }
    }
    
}
