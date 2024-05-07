import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            // int number = 12345;
            System.out.println("ENTER NUMBER : ");
            int number = input.nextInt();
            // System.out.println(number);
            int reversenumber = 0;
            while (number>0) {
                int remainder = number % 10;
                reversenumber = reversenumber * 10 + remainder ;
                number = number / 10;
            }
            
            System.out.println(reversenumber);
        }
    }    
}
