import java.util.Scanner;

public class BasicArithmeticCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for inputs
        System.out.print("Enter first integer (-1000 to 1000): ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer (-1000 to 1000): ");
        int num2 = input.nextInt();

        // Compute arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Quotient (handle division by zero)
        String quotient;
        if (num2 != 0) {
            double result = (double) num1 / num2;
            quotient = String.format("%.4f", result);
        } else {
            quotient = "Undefined (division by zero)";
        }

        // Exponentiation
        double power = Math.pow(num1, num2);

        // Display results
        System.out.println("\nSum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Power: " + (int)power);
    }
}
