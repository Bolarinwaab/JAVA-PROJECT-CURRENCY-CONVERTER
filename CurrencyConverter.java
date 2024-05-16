import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount;
        String continueChoice;

        do {
            // Prompt user for input amount
            System.out.print("Enter the amount in USD to convert: $");
            amount = sc.nextDouble();
            sc.nextLine(); // Consume newline character

            // Convert to different currencies
            convertToNaira(amount);
            convertToEuros(amount);
            convertToBritishPounds(amount);
            convertToJapaneseYen(amount);
            convertToIndianRupees(amount);


            // Ask if user wants to continue
            System.out.print("\nDo you want to convert another amount? (yes/no): ");
            continueChoice = sc.nextLine();
        } while (continueChoice.equalsIgnoreCase("yes"));

        System.out.println("Exiting program...");
        sc.close();
    }

    public static void convertToNaira(double amount) {
        double naira = amount * 1111; // Conversion rate: 1 USD = 1111 Naira
        System.out.printf("$%.2f USD is %.2f Naira\n", amount, naira);
    }
    public static void convertToEuros(double amount) {
        double euros = amount * 0.84; // Conversion rate: 1 USD = 0.84 Euros
        System.out.printf("$%.2f USD is %.2f Euros\n", amount, euros);
    }

    public static void convertToBritishPounds(double amount) {
        double pounds = amount * 0.72; // Conversion rate: 1 USD = 0.72 British Pounds
        System.out.printf("$%.2f USD is %.2f British Pounds\n", amount, pounds);
    }

    public static void convertToJapaneseYen(double amount) {
        double yen = amount * 109.87; // Conversion rate: 1 USD = 109.87 Japanese Yen
        System.out.printf("$%.2f USD is %.2f Japanese Yen\n", amount, yen);
    }

    public static void convertToIndianRupees(double amount) {
        double rupees = amount * 75.02; // Conversion rate: 1 USD = 75.02 Indian Rupees
        System.out.printf("$%.2f USD is %.2f Indian Rupees\n", amount, rupees);
    }
}
