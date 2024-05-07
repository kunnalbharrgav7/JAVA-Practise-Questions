import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
        System.out.println("ENTER PRINCIPLE");
        int Principle = input.nextInt();
        // System.out.println("PRINCIPLE IS " + Principle);
        System.out.println("ENTER RATE");
        int Rate = input.nextInt();
        // System.out.println("RATE IS " + Rate);
        System.out.println("ENTER TIME");
        int Time = input.nextInt();
        // System.out.println("TIME IS " + Time);
        int SI = (Principle*Rate*Time)/100;
        System.out.println("SIMPLE INTEREST IS " + SI);
    }
    
}
}