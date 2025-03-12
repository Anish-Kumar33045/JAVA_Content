
import java.util.Scanner;

class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter the size of array : ");
        int n =  input.nextInt();
        int [] arr = new int [n];

 //input the elements of Array 
        System.out.println("Enter the elements of array ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }

        findEven(arr);

    }

    static void  findEven(int[] arr ){
        int c = 0;
        int d=0;
        for (int i = 0 ; i < arr.length ; i++){
           if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
            c++;
        
           }
           
        }
        System.out.println(); //nxt line
        System.out.println("total even nums are :"+c);
        
          
    }

    
}