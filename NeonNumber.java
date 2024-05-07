import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            System.out.print("ENTER ANY RANDOM NUMBER : ");
            int number = input.nextInt();
            int square = number*number;
            int onesdigit,tensdigit,hundresdigit,thousandsdigit,tenthousandsdigit;
            System.out.println("SQUARE OF GIVEN NUMBER IS "+ square);
            /*while (square>0) {
            int onesdigit = square % 10;
            System.out.println("ONES DIGITS ARE : " + onesdigit);
            square = square / 10;
            System.out.println("TENS DIGITS ARE : " + onesdigit);*/
            
            if (square>0) {
                onesdigit = square % 10;
                System.out.println("ONES DIGIT IS : " + onesdigit);
                square = square / 10;
            }
            if (square>0) {
                tensdigit = square % 10;
                System.out.println("TENS DIGIT IS : " + tensdigit);
                square = square / 10;
            }
            if (square>0) {
                hundresdigit = square % 10;
                System.out.println("HUNDREDS DIGIT IS : " + hundresdigit);
                square = square / 10;
            }
            if (square>0) {
                thousandsdigit = square % 10;
                System.out.println("THOUSANDS DIGIT IS : " + thousandsdigit);
                square = square / 10;
            } if(square>0) {
                tenthousandsdigit = square % 10;
                System.out.println("TENTHOUSANDS DIGIT IS : " + tenthousandsdigit);
                square = square / 10;
            }
            int sumofdigits = onesdigit + tensdigit + hundresdigit + thousandsdigit + tenthousandsdigit ;
            if (square == sumofdigits)
            {
                System.out.println("IT IS AN NEON NUMBER");
            }
            else
            {
                System.out.println("IT IS NOT AN NEON NUMBER");
            }
        }
    }    
}
    

