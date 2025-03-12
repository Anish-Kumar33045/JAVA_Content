
import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = in.nextInt();
        System.out.println(isArmstrong(num));

         System.out.println("the Armstrong numbers are : ");
         for(int i = 0 ; i<1000;i++){
        if(isArmstrong(i))
        System.out.println(i);
     }

    }
     static boolean isArmstrong(int num){
        int sum = 0 ;
        int original = num;
        
        while(num > 0){
            int rem = num % 10 ;
            num = num / 10 ;
            sum = sum + rem * rem * rem ;
        }
 
        return sum == original;

     }


    

}