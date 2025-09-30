public class ifelse{
    public static void main(String[] args) {
        boolean myName = false;
        String name = "boby";

        if (myName) {
            System.out.println("mr " + name);

        }else if (myName) {
            System.out.println("other" + name);
            
        }else {
            System.out.println(" no one only ");
        }

        boolean isSeniorCitizen = true;
        boolean isAdult = false;

        if (isSeniorCitizen) {
            System.out.println(" Hello Senior citizen");
        } else if (isAdult){
            System.out.println("Hello Adult");
        } else {
            System.out.println("Hello child");
        }
        




    }
}