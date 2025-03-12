
// error 404 

enum Status {
    Running , Failed , Pending , Success;
}

public class Enum{

    public static void main(String[] args) 
    {

        //  ex - int i =  5 ; // same as normal variable declartion . 
        
        // Status s = Status.Running;
        // Status s1 = Status.Failed;
        // System.out.println(s);
        // System.out.println(s1);

        // System.out.println(s.ordinal());
        // System.out.println(s1.ordinal());
       // in enum numbering starts from (zero) 0 .

// prints all 
       Status[] ss = Status.values();
       for(Status s : ss ) // enhanced for loop 
       {
       System.out.println(s + " : " + s.ordinal());

       }

    }
}