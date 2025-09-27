import java.util.Scanner;

public class TriangleAria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please inter your Base: ");
        double Base = input.nextDouble();
        System.out.print("please inter your Heigh: ");
        double Heigh = input.nextDouble();

        double area = Base * Heigh;

        System.out.println("The area of triangle is: " + area);

    }
}

//Create a program to calculate the Area of a Triangle. Area of triangle = ½*B*H