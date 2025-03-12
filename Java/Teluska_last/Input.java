// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




class Input{
    public static void main(String[] args) throws IOException 
    {
        System.out.println(" enter the number "); // print o/p
        //  int num = System.in.read();
        // System.out.println(num); // print o/p
        // System.out.println(num-48); // print o/p

         InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

/* BufferedReader can take input from the file , net , others but we have to mention .
       always close it after use 
   */

           int num = Integer.parseInt(bf.readLine());
          
          System.out.println(num);

          bf.close();

    }
}