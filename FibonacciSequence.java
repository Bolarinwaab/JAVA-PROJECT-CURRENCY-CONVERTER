import java.util.Scanner;

public class FibonacciSequence {

    // Function to calculate nth Fibonacci number using recursion
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Function to print the first 30 Fibonacci numbers
    public static void printFibonacciSeries() {
        System.out.println("The first 30 members of the Fibonacci sequence are:");
        for (int i = 0; i < 30; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Print the first 30 Fibonacci numbers
        printFibonacciSeries();

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Print Fibonacci number at a specific index");
            System.out.println("2. Print Fibonacci numbers in a range");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the index: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < 30)
                        System.out.println("Fibonacci number at index " + index + ": " + fibonacci(index));
                    else
                        System.out.println("Index out of range.");
                    break;

                case 2:
                    System.out.print("Enter the starting index of the range: ");
                    int start = sc.nextInt();
                    System.out.print("Enter the ending index of the range: ");
                    int end = sc.nextInt();
                    if (start >= 0 && start < 30 && end >= start && end < 30) {
                        System.out.println("Fibonacci numbers in the range [" + start + ", " + end + "]: ");
                        for (int i = start; i <= end; i++) {
                            System.out.print(fibonacci(i) + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Invalid range.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 3);

        sc.close();
    }
}
