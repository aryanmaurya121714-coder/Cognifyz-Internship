import java.util.Scanner;

public class Task_4_CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = amount * 83.50;
                System.out.println("USD to INR: " + result);
                break;

            case 2:
                result = amount / 83.50;
                System.out.println("INR to USD: " + result);
                break;

            case 3:
                result = amount * 90.50;
                System.out.println("EUR to INR: " + result);
                break;

            case 4:
                result = amount / 90.50;
                System.out.println("INR to EUR: " + result);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}