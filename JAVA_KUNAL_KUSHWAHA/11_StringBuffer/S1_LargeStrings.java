import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

class RandomString{

    static String generate(int size){
    StringBuffer buffer = new StringBuffer();

    Random random = new Random();

    for (int i = 0; i < size; i++) {
        int randomChar = 97 + (int)((random).nextFloat()*26);
        buffer.append((char)randomChar);

    }
       return buffer.toString();
    }
}


public class S1_LargeStrings{
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.capacity()); // bydefault 16

        buffer.append("we make Devs");
        buffer.append(" is nice"); //it appended the same line without creating new object

        //types of constructors
        // constructor 1
        StringBuffer sb = new StringBuffer();

        //constructor2
        StringBuffer sb2 = new StringBuffer("Anish kumar");

        //constructors3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity()); //gives 30 not 16 because specified
        
        
        buffer.insert(2," Guys");
        System.out.println(buffer.toString());
        
        buffer.replace(0, 7, "develop");
        System.out.println(buffer.toString());

        
        buffer.delete(0, 7);
        System.out.println(buffer.toString());
        
        buffer.reverse();
        System.out.println(buffer.toString());

        // Random random1 = new Random();
        // System.out.println(random1.nextFloat());
        // System.out.println((char)(97+1));

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);
      
        String sentence = "hi    name  hjfjdf  w"; // String with white space
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s",""));

        
        String arr = "Anish , darshath, akshay, amruth";
        String[] names = arr.split("");
        // String[] names = arr.split(","); // foe commas and so on
        System.out.println(Arrays.toString(names));

        //rounding off
         DecimalFormat df = new DecimalFormat("0.0000 ");
         System.out.println(df.format(7.27865897352387783758325328));



    }
}
/*
  topic string buffer 
 

  
 */