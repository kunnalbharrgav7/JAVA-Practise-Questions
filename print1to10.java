// import java.util.*;
public class print1to10 {
    public static void main(String args[]){
    // try(Scanner input = new Scanner(System.in))
        int num = 1;
        int sum = 0;
        while(num <= 10 )
        {
            System.out.println(num);
            sum=sum+num;
            num++;
        }
            System.out.println(sum);
    }
}    
