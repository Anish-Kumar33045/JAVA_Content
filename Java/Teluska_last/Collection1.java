
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



/* 
Collection API is concept (library)

Collection  is interface

Collections is Class

Collection ---> List --> ArrayList , LinkedList
           ---> Oueue --> DeQueue
           ---> Set --> Hashset , Linked Hashset
*/
// class Collection1{

//     public static void main(String[] args) {
        
//     //    Collection interface
//         // Collection nums = new Collection() {}// is not possible as Collection is interface 
           
//             // Collection nums = new ArrayList(); // data types not mentioned
//             Collection <Integer>nums = new ArrayList<Integer>(); 
//             nums.add(6);
//             nums.add(8);
//             nums.add(5);
//             nums.add(2);

//             // System.out.println(nums);
//            for(int n : nums) // this gives error  as the nums mentioned above the data types are specified

//            {
//             System.out.println(n);
//            }                

// }

// }



// class Collection1{

//     public static void main(String[] args) {
        
//     // to add and fecth the values Collection makes sense
//             // Collection <Integer>nums = new ArrayList<Integer>(); 

//     // to work with index LIst is best
//     // List<Integer>nums = new ArrayList<Integer>();


//     // Set<Integer>nums = new HashSet<Integer>();
//     // the set don't have repeated elements and can't work with the index

//     // to get sorted elments of values set 
//     Set<Integer>nums = new TreeSet<Integer>();
//             nums.add(6);
//             nums.add(81);
//             nums.add(56);
//             nums.add(29);
//             nums.add(6);

// // System.out.println(nums.indexOf(5)); // gives index num
// // System.out.println(nums.get(2)); // 2 is index number of array
            
//            for(int n : nums) 

//            {
//             System.out.println(n);
//            }                

// }

// }



class Collection1{

    public static void main(String[] args) {
        
     
    Set<Integer>nums = new TreeSet<Integer>();
            nums.add(6);
            nums.add(81);
            nums.add(56);
            nums.add(29);
            nums.add(6);


            Iterator<Integer> values = nums.iterator();
            
            while (values.hasNext()) {   
            System.out.println(values.next());
                
            }
        
}

}