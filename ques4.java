public class MathOperations {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Testing addition
        System.out.println("Addition of 5 and 10: " + mathOps.add(5, 10));
        System.out.println("Addition of 5, 10, and 15: " + mathOps.add(5, 10, 15));
        System.out.println("Addition of 5.5 and 10.5: " + mathOps.add(5.5, 10.5));

        // Testing subtraction
        System.out.println("Subtraction of 10 from 20: " + mathOps.subtract(20, 10));

        // Testing multiplication
        System.out.println("Multiplication of 5 and 4: " + mathOps.multiply(5, 4));

        // Testing division
        System.out.println("Division of 20 by 4: " + mathOps.divide(20, 4));
        
        // Uncomment the following line to test division by zero
        // System.out.println("Division of 20 by 0: " + mathOps.divide(20, 0));
    }
}
