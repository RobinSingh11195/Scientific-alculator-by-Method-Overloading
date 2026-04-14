import java.util.Scanner;

/**
 * Title: Scientific Calculator using Method Overloading and Exception Handling
 */
class Calculator {

    // --- STEP 2: Method Overloading for Addition ---
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // --- Method Overloading for Subtraction ---
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // --- Method Overloading for Multiplication ---
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // --- STEP 3 & 4: Division with Exception Handling ---
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // --- STEP 5: Scientific Functions ---
    public double power(double base, double exp) {
        return Math.pow(base, exp);
    }

    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== OOP Scientific Calculator ===");
        
        try {
            // Testing Overloading (Integer vs Double)
            System.out.println("1. Addition (Int): 10 + 20 = " + calc.add(10, 20));
            System.out.println("2. Addition (Double): 10.5 + 20.3 = " + calc.add(10.5, 20.3));

            // Testing Subtraction and Multiplication
            System.out.println("3. Subtraction: 50.0 - 15.5 = " + calc.subtract(50.0, 15.5));
            System.out.println("4. Multiplication: 5 * 25 = " + calc.multiply(5, 25));

            // Testing Exception Handling for Division
            System.out.print("5. Division (10 / 2): ");
            System.out.println(calc.divide(10, 2));

            System.out.print("6. Division (10 / 0): ");
            System.out.println(calc.divide(10, 0));

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        // Testing Scientific Operations
        System.out.println("\n--- Scientific Operations ---");
        System.out.println("Power (2^3): " + calc.power(2, 3));
        
        try {
            System.out.println("Square Root (16): " + calc.squareRoot(16));
            System.out.print("Square Root (-1): ");
            System.out.println(calc.squareRoot(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram executed successfully without crashing.");
        sc.close();
    }
}