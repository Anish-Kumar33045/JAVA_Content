import java.math.BigInteger;

// A class to demonstrate BigInteger operations and factorial computation
class Factorial {
    // Method to compute factorial of large numbers using BigInteger
    static BigInteger fact(int num) {
        BigInteger ans = BigInteger.ONE; // Initialize with 1
        for (int i = 2; i <= num; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}

public class BigIntegerdemo {

    // Method to demonstrate basic decimal subtraction
    static void BD() {
        double x = 0.03;
        double y = 0.56;
        double ans = y - x;
        System.out.println("Decimal Subtraction (y - x): " + ans);
    }

    // Method to demonstrate various BigInteger operations
    static void BI() {
        BigInteger A = BigInteger.valueOf(2);
        BigInteger B = BigInteger.valueOf(345655283); // Converting int/long to BigInteger
        BigInteger C = new BigInteger("84");
        BigInteger X = new BigInteger("8");

        // Printing values
        System.out.println("BigInteger C: " + C);
        System.out.println("Constant BigInteger.TEN: " + BigInteger.TEN);

        // Arithmetic operations
        System.out.println("Addition (A + B): " + A.add(B));
        System.out.println("Addition (C + X): " + C.add(X));
        System.out.println("Multiplication (C * A): " + C.multiply(A));
        System.out.println("Subtraction (C - A): " + C.subtract(A));
        System.out.println("Division (C / A): " + C.divide(A));
        System.out.println("Remainder (C % A): " + C.remainder(A));

        // Comparison
        if (X.compareTo(C) < 0) {
            System.out.println("X is smaller than C");
        }

        // Factorial of a large number
        System.out.println("Factorial of 20: " + Factorial.fact(20)); // Smaller number for efficiency
    }

    // Main method to call BD and BI
    public static void main(String[] args) {
        System.out.println("Decimal Operations:");
        BD(); // Call BD method

        System.out.println("\nBigInteger Operations:");
        BI(); // Call BI method
    }
}



