import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) 
    {
        try(Scanner input = new Scanner(System.in))
        {
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = a + b;  
            a = temp;       
            count++;   
            System.out.println(b);
        }
            // System.out.println(b);
            
        }
    }   
}
