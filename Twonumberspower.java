import java.util.*;
public class Twonumberspower   {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("ENTER NUMBER : ");
            int num1 = input.nextInt();
            System.out.print("ENTER POWER : ");
            int power = input.nextInt();
            int result = 1;
            int i = 1;
            while (i<=power)  {
                result = result * num1;
                i++;
            }            
                System.out.println(result) ;   
            }
        }
    }    
