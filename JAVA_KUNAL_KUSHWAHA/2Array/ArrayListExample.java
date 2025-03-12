
import java.util.ArrayList;
import java.util.Scanner;



class ArrayListExample {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        // syntax 
        // Arraylist < Wrapper class > variable = new ArrayList< Wrapper class ( need not be specified ) > ( intial count )

        ArrayList<Integer> list = new ArrayList<>(3);
        // list.add(85);
        // list.add(55);
        // list.add(95);   //the capacity is mentioned 3 but on adding list it printa all
        // list.add(51);
        // list.add(63);

        System.out.println(list.contains(768)); // return true or false , tells whether the element is there in the list
    //    list.clear();  // clears all the elements in the list

        //   list.add(2,99);  //list.add(index, element);

        //  list.set(2,6789); // list.set(index, element) 

        //   list.remove(2); // removes the element in particular index 

        //   System.out.println(list.hashCode()); // gives hash code 

        // System.out.println(list);  // internally call toString method 

           //input  
          for(int i=0; i<5; i++){
           list.add(in.nextInt());
         }

          // getting the item at any index 
         for(int i=0; i<5; i++){
            System.out.println(list.get(i));
         }

        
    }
}