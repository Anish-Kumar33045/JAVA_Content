
// import java.util.List;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;






// public class List1{


//     public static void main (String a[]){
 
//  List<Integer> nums = Arrays.asList(4,5,6,7);



// int sum =0;
// // for(int n : nums){

// //        if(n%2==0){
// //         n=n*2;
// //         sum = sum + n ;
// //        }
// // }
// // System.out.println(sum);



// // for(int n : nums){

// // System.out.println(n);
       
// // }

// Consumer<Integer> con = new Consumer<Integer>(){
//     public void accept(Integer n){

//         System.out.println(n);

//     }
// };
// nums.forEach(con);

// // nums.forEach(n-> System.out.println(n));
// // above two methods are same and one above is shortened by lambda expression

             
//     }




 class List1{


    public static void main (String a[]){
 
 List<Integer> nums = Arrays.asList(4,5,6,7);

// now s1 contains all the elements in the list 
//  changes in s1 don't affect the list nums
// stream can't be reused

Stream<Integer> s1 = nums.stream();
Stream <Integer> s2 = s1.filter(n-> n%2==0);
// here the s1 is used and new s2 stream filters the only the even numbers 
Stream<Integer> s3 = s2.map(n-> n*2);
 int result = s3.reduce(0,(c,e)->c+e);


// nums.forEach(n-> System.out.println(n));

// s1.forEach(n-> System.out.println(n));
// s2.forEach(n-> System.out.println(n));
// s3.forEach(n-> System.out.println(n));
 System.out.println(result);

             
    }
}