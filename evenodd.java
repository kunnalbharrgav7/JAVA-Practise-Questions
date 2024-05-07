import java.util.Scanner;
public class evenodd {
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in)){
        System.out.println("Enter the number to check ");
        int number = input.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("Number is EVEN ");
        }
        else {
            System.out.println("Number is ODD ");
        }

    }
    
}
}