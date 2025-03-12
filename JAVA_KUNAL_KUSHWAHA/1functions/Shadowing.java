class Shadowing {
    static int x = 90 ; // if 'x' is static can be used inside the block of static main 

    public static void main(String[] args) {

        System.out.println(x);  // prints 90 
        // int x =40 ;           // the lower level scope is excuted and higher level is shadowed .

        int x ;
        // System.out.println(x);  // scope will begin when teh value is intialised
        x = 40 ; 
        System.out.println(x);   
        fun();          // it prints 90 as the int x = 90 ; is available in the outer bracket " yellow bracket "
        
    }
    static void fun(){
            System.out.println(x);
        }
        
}