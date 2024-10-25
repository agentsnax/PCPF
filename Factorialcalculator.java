import java.util.Scanner;

public class FactorialCalculator {

    // Method to calculate factorial using recursion
    public static long factorial(int n) {
        if (n <= 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }
        
        sc.close();
    }
}