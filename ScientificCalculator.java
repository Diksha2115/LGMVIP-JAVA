import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result = 0;

            switch (choice) {
                case 1:
                    result = add();
                    break;
                case 2:
                    result = subtract();
                    break;
                case 3:
                    result = multiply();
                    break;
                case 4:
                    result = divide();
                    break;
                case 5:
                    result = squareRoot();
                    break;
                case 6:
                    result = power();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    continue;
            }

            System.out.println("Result: " + result);
            System.out.println("====================================");
        }

        scanner.close();
    }

    private static double add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    private static double subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    private static double multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    private static double divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();

        if (denominator == 0) {
            System.out.println("Cannot divide by zero. Please enter a non-zero denominator.");
            return 0;
        }

        return numerator / denominator;
    }

    private static double squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
            return 0;
        }
        return Math.sqrt(num);
    }

    private static double power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }
}
