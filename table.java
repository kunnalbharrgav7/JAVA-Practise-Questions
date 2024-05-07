import java.util.*;
public class table {
    public static void main(String args[]){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("ENTER THER NUMBER FOR TABLE :");
            int number = input.nextInt();
            for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number*i));                
            }        
        }
    }
}    
