package loop;
import java.util.Scanner;

public class loop{
    public static void main(String[] args) {
        // int num = 1;

        // while ( num <= 100) {                 // condition 
        //     System.out.println(num);         // acutal work
        //     num = num + 1;                   //updating the condition
        // }

        // int num = 500; 

        // while (num >= 200) {
        //     System.out.println(num);
        //     num = num - 1;
            
        // }
        
        Scanner input = new Scanner(System.in);
        int i = 0; 
        while (i < 5) {
            int inp = input.nextInt();
            System.out.println(" number is: " + inp);
            inp = inp + i;
        }


    }
}