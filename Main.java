import java.util.Scanner;
public class ScientificCalculator {
    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        int subtract(int a, int b) {
            return a - b;
        }

        double subtract(double a, double b) {
            return a - b;
        }

        int multiply(int a, int b) {
            return a * b;
        }

        double multiply(double a, double b) {
            return a * b;
        }

        double divide(int a, int b) {
            try {
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return (double) a / b;
            } catch (ArithmeticException e) {
                System.out.println("  Error: Cannot divide by zero! (" + e.getMessage() + ")");
                return Double.NaN;
            }
        }

        double divide(double a, double b) {
            try {
                if (b == 0.0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
            } catch (ArithmeticException e) {
                System.out.println("  Error: Cannot divide by zero! (" + e.getMessage() + ")");
                return Double.NaN;
            }
        }

        double squareRoot(double a) {
            try {
                if (a < 0) {
                    throw new IllegalArgumentException("Cannot take sqrt of a negative number");
                }
                return Math.sqrt(a);
            } catch (IllegalArgumentException e) {
                System.out.println("  Error: " + e.getMessage());
                return Double.NaN;
            }
        }

        double power(double base, double exponent) {
            return Math.pow(base, exponent);
        }

        double sin(double angleDegrees) {
            return Math.sin(Math.toRadians(angleDegrees));
        }

        double cos(double angleDegrees) {
            return Math.cos(Math.toRadians(angleDegrees));
        }

        double tan(double angleDegrees) {
            try {
        
                if ((angleDegrees % 180) == 90) {
                    throw new ArithmeticException("tan is undefined at " + angleDegrees + " degrees");
                }
                return Math.tan(Math.toRadians(angleDegrees));
            } catch (ArithmeticException e) {
                System.out.println("  Error: " + e.getMessage());
                return Double.NaN;
            }
        }

        double log(double a) {
            try {
                if (a <= 0) {
                    throw new IllegalArgumentException("Logarithm undefined for value <= 0");
                }
                return Math.log(a);
            } catch (IllegalArgumentException e) {
                System.out.println("  Error: " + e.getMessage());
                return Double.NaN;
            }
        }
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator(); 

        System.out.println("============================================");
        System.out.println("     SCIENTIFIC CALCULATOR - OOP PROJECT    ");
        System.out.println("     B.Tech CSE | 2nd Semester              ");
        System.out.println("============================================");

        System.out.println("\n--- ADDITION (Method Overloading) ---");
        System.out.println("  add(5, 10)          = " + calc.add(5, 10));
        System.out.println("  add(5.5, 2.3)       = " + calc.add(5.5, 2.3));
        System.out.println("  add(1, 2, 3)        = " + calc.add(1, 2, 3));

        System.out.println("\n--- SUBTRACTION (Method Overloading) ---");
        System.out.println("  subtract(20, 8)     = " + calc.subtract(20, 8));
        System.out.println("  subtract(9.5, 3.2)  = " + calc.subtract(9.5, 3.2));

        System.out.println("\n--- MULTIPLICATION (Method Overloading) ---");
        System.out.println("  multiply(4, 5)      = " + calc.multiply(4, 5));
        System.out.println("  multiply(2.5, 4.0)  = " + calc.multiply(2.5, 4.0));

        System.out.println("\n--- DIVISION (Exception Handling) ---");
        System.out.println("  divide(10, 2)       = " + calc.divide(10, 2));
        System.out.println("  divide(7.5, 2.5)    = " + calc.divide(7.5, 2.5));
        System.out.print ("  divide(5, 0)        -> ");
        calc.divide(5, 0);  

        System.out.println("\n--- SCIENTIFIC OPERATIONS ---");
        System.out.println("  squareRoot(25)      = " + calc.squareRoot(25));
        System.out.printf ("  squareRoot(2)       = %.4f%n", calc.squareRoot(2));
        System.out.print ("  squareRoot(-4)      -> ");
        calc.squareRoot(-4);  

        System.out.printf ("  power(2, 10)        = %.0f%n", calc.power(2, 10));
        System.out.printf ("  power(3.5, 2)       = %.2f%n", calc.power(3.5, 2));

        System.out.printf ("  sin(30°)            = %.4f%n", calc.sin(30));
        System.out.printf ("  cos(60°)            = %.4f%n", calc.cos(60));
        System.out.printf ("  tan(45°)            = %.4f%n", calc.tan(45));

        System.out.printf ("  log(e) [ln(2.718)]  = %.4f%n", calc.log(Math.E));
        System.out.print ("  log(-5)             -> ");
        calc.log(-5);       

        System.out.println("\n============================================");
        System.out.println("     All operations completed successfully!  ");
        System.out.println("============================================");
    }
}
