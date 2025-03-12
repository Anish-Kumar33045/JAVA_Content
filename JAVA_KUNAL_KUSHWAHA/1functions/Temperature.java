
import java.util.Scanner;

class Temperature {

    public static void main(String[] args) {
        System.out.print("enter the temperature in celsius : ");
        
        Scanner in = new Scanner(System.in);
         
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5 ) + 32 ;
        System.out.println(tempF);
    }
}


