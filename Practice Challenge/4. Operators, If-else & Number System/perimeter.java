import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please inter your 4 sides cm: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        
        int peri = a + b + c + d;
        System.out.println(" resut is: " + peri);
    }
}
