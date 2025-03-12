
import java.util.HashMap;
import java.util.Map;





class Collections2{

    public static void main(String[] args) {
        
     Map <String , Integer > students = new HashMap<>();

    // the HashTable gives in Synchronised manner
    //  Map <String , Integer > students = new Hashtable<>();

     students.put("Anish" , 100);
     students.put("Nitesh" , 99);
     students.put("Rakesh" , 98);
     students.put("Amruth" , 97);
    //  when we add the new value for same name we can see that 
    //  the value is not repeated instead it is changed 
      students.put("K.AnishKumar",1000);
    
// to get all names 
System.out.println(students.keySet());

// to print all the names with values 

for( String key : students.keySet())
{
    System.out.println(key + " : " + students.get(key));
}

            // System.out.println(students);
            //   System.out.println(students.get("Anish"));

}

}