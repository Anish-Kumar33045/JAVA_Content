
import java.util.Arrays;
import java.util.Scanner;

class StringSearch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name ");
        String name = in.next();
        // System.out.println("Enter the character to be searched in name ");
        // char ch = in.next();

        char Ch = 'u' ;
         
        //  System.out.println( search(name,Ch));
         System.out.println( search2(name,Ch));
         System.out.println(Arrays.toString(name.toCharArray()) );
        //  System.out.println(Arrays.toString(name) ); // this gives the error as to string to string again is not possible

    }
    static boolean search2 (String name , int key){

           if(name.length() == 0 ){
            return false ;

           }

           for (char Ch : name.toCharArray()) { //for each loop 
               if( key == Ch){                  
                return true ;
               }
           }
           return false ;
    }

    static boolean search (String name , int key){

           if(name.length() == 0 ){
            return false ;

           }

           for (int i = 0; i < name.length(); i++) {  // for loop 
               if( key == name.charAt(i)){ 
                return true ;
               }
           }
           return false ;
    }
}