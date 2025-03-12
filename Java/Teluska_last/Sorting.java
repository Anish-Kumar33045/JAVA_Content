
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;




class Sorting{
    public static void main(String[] args) {
        
        Comparator<Integer> com = new Comparator<Integer>(){
           
           public int compare (Integer i ,Integer j)
           {
            if(i%10 > j%10)
            return 1;
            else 
            return -1;
           }

        };

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(78);
        nums.add(85);
        nums.add(65);
        nums.add(32);

        // Collections.sort(nums ); // gives the sorted array

       
       
        System.out.println(nums);
    }
}