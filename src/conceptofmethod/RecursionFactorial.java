package conceptofmethod;

public class RecursionFactorial {

    static int factorial(int n) {
        // Base case: If n is 0, the factorial is 1.
        if (n == 0) {
            return 1;
        }

        // Recursive case: Calculate the factorial by multiplying n with the factorial of (n - 1).
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 4;

        // Calculate and print the factorial of n.
        int result = factorial(5);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
