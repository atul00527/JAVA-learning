import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wlcome to swaping: ");
        System.out.print("Inter valu of A: ");
        int a = input.nextInt();
        System.out.print("inter valu of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("valu of A is: " + a);
        System.out.println("valu of B is: " + b);

    }   
}
