import java.util.*;
public class Sumevenodd {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("ENTER NUMBER : ");
            int number = input.nextInt();
            int evensum=0;
            int oddsum=0;
            if (number % 2 == 0) {
                // evensum = evensum + number;
                evensum += number;
            }
            else{
                // oddsum = oddsum + number;
                oddsum += number;
            }
            System.out.println("SUM OF ALL EVEN NUMBERS ARE : " + evensum);
            System.out.println("SUM OF ALL ODD NUMBERS ARE : " + oddsum);
        }
    }    
}