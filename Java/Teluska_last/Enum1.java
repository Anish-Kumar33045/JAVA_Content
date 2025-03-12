// enum is same as class , we can create variables , methods 
// but we can't extend it . 
enum Status {
    Running , Failed , Pending , Success;
}

public class Enum1{

    public static void main(String[] args) 
    {
          Status s = Status.Pending;
          
          if (s == Status.Running)
          System.out.println("All Good");
          else if (s == Status.Failed)
          System.out.println("Try Again");
         else if (s == Status.Pending)
          System.out.println("Please Wait ..");
          else 
          System.out.println("Done");
          
          // using if else ladder with enum 

         // we can also use switch 
        /*  switch (s)
          {
             case Running:
                System.out.println("All Good");
                break;

                case Pending:
                System.out.println("Please Wait ");
                break;

                 case  Failed :
                System.out.println("Try again");
                break;

                 default: //success
                System.out.println("Done");
                break;
            
                
          }

          */

       
    }
}