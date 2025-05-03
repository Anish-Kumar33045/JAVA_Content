
class A 
{
    // public void show()
    public void showTheDataWhichBelongsToThisClassAndwhichistoolong()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    // public void show()
     // so it executes A show 
    // this type of error occurs normally 
    // to prevent it we can use annotations

    // public void showTheDataWhichBelongToThisClassAndwhichistoolong();   // there is spelling mistake in the word "belongs" "belong"
    


@Override
public void showTheDataWhichBelongsToThisClassAndwhichistoolong()  

    {
        System.out.println("in B show");
    }
}

public class Annotations{

    public static void main(String arg[]) {
        B obj = new B();
        // obj.show();
         obj.showTheDataWhichBelongsToThisClassAndwhichistoolong();
    }
}
/* there are many annotations we use in frame works usually */