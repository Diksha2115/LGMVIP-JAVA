import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        // Assuming a simple conversion rate for demonstration purposes
        double conversionRate = 1.18;  // 1 USD to EUR rate

        double eurAmount = usdAmount * conversionRate;

        System.out.println("Equivalent amount in EUR: " + eurAmount);

        scanner.close();
    }
}
