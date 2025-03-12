
import java.util.Arrays;

/* 
 * String is the non primitive data type .
 * Strings is the array of characters .
 * 
 * 
 */
public class A_STrings {
    public static void main(String[] args) {
        String a = "Anish";
        String b = "Anish";
     System.out.println(a==b); // gives true as the a and b points to same object 

     String name1 = new String("anish");
     String name2 = new String("anish");
     System.out.println(name1==name2); // gives false as both points to different objects .
     
     System.out.println(name1.equals(name2));
     // as of arrays we can't write as name1[0] so we use .charAt(index_number) ;

     System.out.println(name1.charAt(0));

     System.out.println(Arrays.toString(new int[] {1,2,3,4,5})); // string is printed 
    //   here above the string gets the object and converts into the string 

    


    }
}
