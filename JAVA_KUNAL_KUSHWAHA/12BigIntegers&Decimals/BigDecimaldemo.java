import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimaldemo {
    public static void main(String[] args) {
        // Creating BigDecimal objects
        BigDecimal num1 = new BigDecimal("123.456");
        BigDecimal num2 = new BigDecimal("10.2");

        // Addition
        BigDecimal sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        // Subtraction
        BigDecimal difference = num1.subtract(num2);
        System.out.println("Difference: " + difference);

        // Multiplication
        BigDecimal product = num1.multiply(num2);
        System.out.println("Product: " + product);

        // Division with rounding
        BigDecimal quotient = num1.divide(num2, 2, RoundingMode.HALF_UP);
        System.out.println("Quotient: " + quotient);

        // Setting scale
        BigDecimal scaled = num1.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Scaled (2 decimal places): " + scaled);

        // Comparison
        int comparison = num1.compareTo(num2); // -1 if num1 < num2, 0 if equal, 1 if num1 > num2
        String comparisonResult = (comparison < 0) ? "less than" :
                                  (comparison == 0) ? "equal to" : "greater than";
        System.out.println("num1 is " + comparisonResult + " num2");
    }
}
