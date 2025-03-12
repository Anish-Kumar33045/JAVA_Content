/*
 * 1) try break to smaller problems
 * 2) recurrence relation
 * 3) draw recursive tree
 * 4) about the tree
 *    - see the flow of fn and how thay are getting to stack
 *    - identify and focus on left and right tree calls
 *    - until the left tree is called then right tree is not called
 *    - draw the tree and pointer the again and again in pen and paper
 *    - use debugger to understand
 *  
 * 5) is how value is returned at each step
 *    see where fn call will come out 
 *    atlast you will come out of main function
 *    
 */
import java.util.Scanner;


public class C_fibbonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("enter the number:");

        // int n = scanner.nextInt();
        
        int ans = fib(4);
        System.out.println(ans);
    
    }

    static int fib(int n){
        if(n<2){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2); // this is not tailed recursion 
            //imp- fib(n-1) is executed first then then fib(n-2) as the order thet are written in code
        }
    }
    
}
/*
 * the fibbonacci series can written without using recursion as:
 * 
 * 
 * import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Call the function to print the Fibonacci series
        printFibonacci(n);

        scanner.close();
    }

    // Function to print Fibonacci series
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
 */