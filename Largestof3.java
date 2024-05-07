import java.util.Scanner;
public class Largestof3 {
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in)){
        System.out.println("ENTER THE NUMBERS :");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        /*{
            int largest = num1;
            // System.out.println("number 1 is largest " + num1);
            if (num2 > largest) {
                largest=num2;
                // System.out.println("number 2 is largest " + num2);       
            }
            if (num3 > largest) {
                largest=num3;
                // System.out.println("number 3 is largest " + num3);                
            }  
            System.out.println(largest + "IS LARGEST");
            }*/
            if (num1>num2 && num1>num3) {
                System.out.println(num1 + " IS LARGEST");
            }
            if (num2>num1 && num2>num3) {
                System.out.println(num2 + " IS LARGEST");
            } else {
                System.out.println(num3 + " IS LARGEST");
            }
            }
        }
    }
