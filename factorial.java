import java.util.*;
public class factorial {
    public static void main(String args[]){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("ENTER THE NUMBER FOR FACTORIAL : ");
            int number = input.nextInt();
            int factorial=1;
            int i=1;
            while (i<=number) {
                factorial = factorial * i;
                i++;
            }
            System.out.println(factorial);
        }
    }    
}


