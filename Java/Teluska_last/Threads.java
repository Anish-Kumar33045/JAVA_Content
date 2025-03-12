/*

class A extends Thread
{
    // public void show()
    public void run()
    {
        for(int i=0 ; i<50 ; i++){
            System.out.println("Hi");
            try {
                // since the machine is so fast and prints multiple Hi in milli secs
                // we control by writing
                Thread.sleep(10);
            } 
            catch (InterruptedException ex) 
            {
                      ex.printStackTrace(); 
            }
        }
    }
}

// class B 
class B extends Thread
{
    // public void show()
    public void run()
    {
        for(int i=0 ; i<50 ; i++){
            System.out.println("Hello");
            try {
                // since the machine is so fast and prints multiple Hi in milli secs
                // we control by writing
                Thread.sleep(10);  // when we mention the sleep it goes for waiting stage 
            }
             catch (InterruptedException ex) 
             {

            }
        }
    }
}

// after the try catch and thread.sleep() it runs simultaneously



class Threads

{
    public static void main(String[] args) {
        A hi = new A();
        B hello = new B();

       // after the class A show method is excuted 
    //    the class B show method " Hello " is excuted 
    // these are running in sequence  ..


        // hi.show();
        // hello.show();

        // inorder to excutes it simultanously both class A and B 
        // we extend the class by threads and write start() as used below 


System.out.println(hi.getPriority());
//   5 is normal priority
//   1 is least priority
//   10 is max priority

        hi.start();
        //  if required excute the below block  
        // try {
        //         Thread.sleep(2);
        //     }
        //      catch (InterruptedException ex) 
        //      {

        //     }
        hello.start();  
        // start belongs to class Thread
        //  in every thread having start() method must have run() method . 
          
       

    }
}   

*/


/*


class A implements Runnable
{
   
    public void run()
    {
        for(int i=0 ; i<5 ; i++){
            System.out.println("Hi");
            try {
              
                Thread.sleep(10);
            } 
            catch (InterruptedException ex) 
            {
                      ex.printStackTrace(); 
            }
        }
    }
}

 
class B implements Runnable
{
 
    public void run()
    {
        for(int i=0 ; i<5 ; i++){
            System.out.println("Hello");
            try {
                
                Thread.sleep(10);  // when we mention the sleep it goes for waiting stage 
            }
             catch (InterruptedException ex) 
             {

            }
        }
    }
}

                                                                          
class Threads

{
    public static void main(String[] args) {

        // A hi = new A();
        // B hello = new B();

        //  hi and hello refernce variables don't known about t1 and t2
        //  so we write as

         Runnable  hi = new A();
        Runnable hello = new B();
        // we can create refernce var of interface and object by subclass

      

       


        // hi.start();
        // hello.start();  // inRunnable interface we don't have start().
                        //   so it gives error
        
        // so create two threads as shown 

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);

        t1.start();
        t2.start();
       

    }
} 

*/

// class A implements Runnable
// {
   
//     public void run()
//     {
//         for(int i=0 ; i<5 ; i++){
//             System.out.println("Hi");
//             try {
              
//                 Thread.sleep(10);
//             } 
//             catch (InterruptedException ex) 
//             {
//                       ex.printStackTrace(); 
//             }
//         }
//     }
// }

 
class B implements Runnable
{
 
    public void run()
    {
        for(int i=0 ; i<5 ; i++){
            System.out.println("Hello");
            try {
                
                Thread.sleep(10);  // when we mention the sleep it goes for waiting stage 
            }
             catch (InterruptedException ex) 
             {

            }
        }
    }
}

                                                                          
class Threads

{
    public static void main(String[] args) {

        

    //      Runnable  hi = new Runnable()
    //      {
    //          public void run()
    // {
    //     for(int i=0 ; i<5 ; i++){
    //         System.out.println("Hi");
    //         try {
              
    //             Thread.sleep(10);
    //         } 
    //         catch (InterruptedException ex) 
    //         {
    //                   ex.printStackTrace(); 
    //         }
    //     }
    // }
    //      };


// since the Runnable is functional interface we can use lambda expression

         // we can't excute the class A when we comment or remove it 
         //   so we create the anonymous class Runnable 

          Runnable  hi =  () ->
    {
        for(int i=0 ; i<5 ; i++){
            System.out.println("Hi");

            try {  Thread.sleep(10); }

             catch (InterruptedException ex)  {
                 ex.printStackTrace(); }
        }
    };
        
        Runnable hello = () ->
    {
        for(int i=0 ; i<5 ; i++){
            System.out.println("Hello");

            try {  Thread.sleep(10); }

             catch (InterruptedException ex)  {
                 ex.printStackTrace(); }
        }
    };
    

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);

        t1.start();
        t2.start();
       

    }
} 