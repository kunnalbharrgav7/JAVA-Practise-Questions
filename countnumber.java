import java.util.*;
public class countnumber {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("ENTER NUMBER : ");
            int num = input.nextInt();
            // int num = 1353535343;
            int count = 0;
            while (num>0) {
                int remainder = num % 10;
            /*if (remainder == 3) {
                count++;
                num = num / 10;
                System.out.println(count);
            }
            else{
                num = num / 10;
            }*/
            if (remainder == 3) {
                count++;
            }
            num = num /10;
        }
        System.out.println(count);
    }    
}
}