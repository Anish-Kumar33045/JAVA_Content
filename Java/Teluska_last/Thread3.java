class Thread3{
    public static void main(String[] args) {
        
    }
}

/*

              Thread States 
    new state  --->  for Ex --> Thread t1 = new Thread();
    here the new state is created 

when the start() is excuted then the runnable method is reached 
    Runnable ---> when the thread is waiting for excuting and waiting for scheduler then it is in Runnable State 
       |
     run()
       |
    Running  ---> when the thread is actually is running in CPU it is in Running State
        |
      sleep() , wait()
        |
    Waiting State  ---> it can be sent to Runnable State by using keyword " notify "
                     when we use wait remember to use notify() method later to attain the Runnable state again 

        Running state can be sent to the DEAD state by using Stop()  ;
        Runnable to Dead by Stop() ;
 
 */