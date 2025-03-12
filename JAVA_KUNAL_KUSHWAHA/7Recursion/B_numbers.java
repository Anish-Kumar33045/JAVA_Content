// when the function finishes executing , 
// it is removed from stack and the flow of program is restored to where it is called
// understand by running message or this 

// base condition is where the recursion stops 

/*
 *    print(5)      // the following is stack 
 *    print(4)      // the memory is allocated seperately for eeach function calls .
 *    print(3)
 *    print(2)
 *    print(1)
 *    main()
 */

 /*      .
         .
         .           // if no base condition is mentioned then the memory is allocated
         .           // seperately  for each call and computer memory exceeds the memory limit
  *    print()       // then is called stack overflow 
  *    print()
  *    print()
  *    print()
  *    print()
  */
class B_numbers{
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        if(n==5){  // base condition is 5
        return;    
        }
        System.out.println(n);
        print(n+1); // last function call is called tailed recursions
    }
}

// recursion is solving bigger and complex problems in simple way 
// we can convert the recursio solutions into iteration and viceversa 
// iterations is nothing but loops 
// the recursive tree concept ***