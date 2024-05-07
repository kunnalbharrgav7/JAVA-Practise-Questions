import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter number1");
            int num1 = input.nextInt();
            System.out.println("enter number2");
            int num2 = input.nextInt();
            //int num1=10,num2=20;
            int addition = num1 + num2 ;
            System.out.println(addition);
            int substraction = num1 - num2 ;
            System.out.println(substraction);
            int multiplication = num1 * num2 ;
            System.out.println(multiplication);
            int division = num1 / num2 ;
            System.out.println(division);
            int remainder = num1 % num2 ;
            System.out.println(remainder);
    }
}
}
