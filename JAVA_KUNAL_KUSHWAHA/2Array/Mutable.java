
import java.util.Arrays;
import java.util.Scanner;

//  mutable behaviour 

class Mutable {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        
        System.out.println(Arrays.toString(arr));

        change (arr);
        
        System.out.println(Arrays.toString(arr));
        
    }

    static void change (int [] num){

        System.out.println("enter the position to be changed ");
       Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        num[i-1] = 99;
    }
}