

class Counter{
    int count;
    // public void increment()
    public synchronized void increment()  // 20,000 is obtained because
            //  now both the methods not type values at a time .
    {
        count ++;
    }
}
                                                                          
public class Threads2

{
    public static void main(String[] args) throws InterruptedException {


      Counter c = new Counter();

          Runnable  obj1 =  () ->
    {
        for(int i=0 ; i<10000 ; i++)
        {
              c.increment();
        }
    };
        
        Runnable obj2  = () ->
    {
        for(int i=0 ; i<10000 ; i++)
        {
           c.increment();
        }
    };
    

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        // the join method used where the main method waits for the other to methods to comeback 
        // the 20,000 is not obtained 
        System.out.println(c.count);
       

    }
} 