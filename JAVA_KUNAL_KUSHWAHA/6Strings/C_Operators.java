
import java.util.ArrayList;

public class C_Operators {
    public static void main(String[] args) {
     System.out.println('a'+'b'); // characters are converted to aska values and adds 
     System.out.println("a" + "b");  // with strings it concatenate 
     System.out.println('a'+ 3);  
     System.out.println( (char) ('a'+ 3) );
     System.out.println("a"+3); 
     // when the integer is added with the string 
    //  then integer will call Integer that will call tostring() (which is same as "a"+"1")

    System.out.println("Kumar"+ new ArrayList<>()); //return array 
    System.out.println("Kumar"+ new Integer(56)); // gives Kumar56

    // System.out.println(new Integer(56) + new ArrayList<>());// this gives ERROR
    
    // since + operator is defined for adding the primitive datatype and strings concatenation
    
    // but the above lines works if any one part is string and result entire thing to String type 
    System.out.println(new Integer(56) +""+ new ArrayList<>());

//   operator overloading in java is not supported for software engineering consideration 
// in Cpp the + operator use can be modified by operator overloading 


    }
}
