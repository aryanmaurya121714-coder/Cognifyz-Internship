package level_1;
import java.util.Scanner;

public class Task1_TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = sc.next().toUpperCase().charAt(0);

        if (unit == 'C') {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println(temp + " Celsius = " + fahrenheit + " Fahrenheit");
        } else if (unit == 'F') {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println(temp + " Fahrenheit = " + celsius + " Celsius");
        } else {
            System.out.println("Invalid unit. Please enter C or F.");
        }

        sc.close();
    }
}
