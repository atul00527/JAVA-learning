import java.util.Scanner;

public class simpleIntresst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome your simple intrest calculator");
        System.out.print("Please inter your P: ");
        double principal = input.nextDouble();
        System.out.print("Please inter your r: ");
        double rate = input.nextDouble();
        System.out.print("Please inter your t: ");
        double time = input.nextDouble();

        double simpleIntresst = (principal*rate*time)/100;

            System.out.println("simple Intrest is: " + simpleIntresst);


    }   
}
