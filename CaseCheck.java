import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("ENTER CHARACTER : ");
            char ch = input.next().trim().charAt(0);
            // char ch = input.next();
            if(ch >= 'A' && ch <= 'Z'){
                System.out.println("UPPER CASE");
            }
            else{
                System.out.println("lower case");
            }
        }
    }    
}
