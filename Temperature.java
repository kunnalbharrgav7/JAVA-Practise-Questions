import java.util.Scanner;

    public class Temperature {
        public static void main(String[] args)
        {
            try(Scanner input = new Scanner(System.in))
            {
            System.out.print("enter temperature in Celsius : ");
            float tempC = input.nextFloat();
            float tempF = (tempC * 9/5) + 32 ;
            System.out.println("Temperature in Celsius : " + tempC + " Temperature in Fahrenheit : " + tempF);
            
        }
}   
    }
