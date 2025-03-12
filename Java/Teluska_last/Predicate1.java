
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Predicate1{

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,6,7);


       Function<Integer , Integer > fun = new Function<Integer,Integer>(){

            public Integer apply(Integer n){
                return n*2;
            }

       };
        
        
        
        Predicate<Integer> p = new Predicate<Integer>(){

            public boolean test(Integer n){
                   return n%2==0;
            }

        };

                  int result = nums.stream()
                                   .filter(p)
                                   .map(fun)
                                   .reduce(0,(c,e)->c+e);

                 System.out.println(result);



    }
}