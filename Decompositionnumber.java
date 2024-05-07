import java.util.Scanner;
public class Decompositionnumber {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("ENTER NUMBER : ");
            int number = input.nextInt();
            // int number = 123;
            int digit ;
            while (number>0) {
            digit = number % 10;
            number = number /10;
            System.out.println(digit);
            }
        }
    }
}
