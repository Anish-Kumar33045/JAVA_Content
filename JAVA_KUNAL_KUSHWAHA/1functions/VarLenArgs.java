
import java.util.Arrays;

class VarLenArgs{
public static void main(String[] args) {
    fun(2,34,56,78,98,567,45,342,231);
    fun ( 56 , 78 , " Anish " ,  " kumar " , " amruth " , " raj ");
}
    
static void fun (int a , int b , String ...v) // the order of passing the parameters is to be maintained 
{
  System.out.println(a + " " + b + " "+ Arrays.toString(v));

}
/* function overloading 
 both the methods have same functions but the passing parametrs depends , it calls the respective function*/


   static void fun( int ...v){  /* int ...(any variable)  --> it holds the integer array
   it is used when the number of inputs is not known.
   these are called variablle length arguments  */
    System.out.println(Arrays.toString(v));
   }

} 