import java.util.*;
public class Calculator2 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int result = 0;
            System.out.println("ENTER TWO NUMBERS : ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.print("ENTER OPERATOR : ");
            char operator = input.next().trim().charAt(0);
            while (true) {
    
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
            if (operator == '+') {
                result = num1 + num2;
            }
            if (operator == '-') {
                result = num1 - num2;
            }
            if (operator == '*') {
                result = num1 * num2;
            }
            if (operator == '/') {
                result = num1 / num2;
            }
            if (operator == '%') {
                result = num1 % num2;
            }
            }
            else if (operator == 'x' || operator == 'X' ) {
                break;
            }
            else{
                System.out.println("INVALID OPERATION!!!");
            }
        } 
                System.out.println("RESULT : " + result);    
            
        }
    }    
}
