
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 ctrl and click find which is subclass , which implements what , extends what and so on

 */

public class OOPS7aCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        List<Integer> list2 = new LinkedList<>();
        list2.add(34);
        list2.add(23);
        list2.add(45);
        list2.add(74);
        list2.add(94);
        
        System.out.println(list2); // Arrays.toString inside it
    
         List<Integer> vector = new Vector<>();
         vector.add(45);
         vector.add(55);
         vector.add(65);
         vector.add(75);
         vector.add(85);
        System.out.println(vector);
           
    }
}

/*
 *   Arrays multiple threads can acess it simultaneously
 *   vectors when one thread is working other wait for their execution and work later after their completion
 *  but arraylist is faster than vector
 */
/*
         Parent obj = new Child();
         parent --> represents the type of reference variable (obj)
         child --> represents actual object being created
         in java reference variable of parent class can hold the subclasses like child

         compile time --> refernce type determines what methods and properties can be accessed.
         since the refernce type is the parent , only its methods and properties are directly accessed 
         
         runtime --> the child methods are implemented if they are overriden
         
         */