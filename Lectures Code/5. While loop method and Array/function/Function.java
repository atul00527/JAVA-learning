
public class Function {
    public static void main(String[] args) {
        printPattern();
        
    }
    public static void printPattern() {
        int rows = 0;
        while (rows < 10) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
                
            }
            System.out.println();
            rows++;
        }
    }
    

}
