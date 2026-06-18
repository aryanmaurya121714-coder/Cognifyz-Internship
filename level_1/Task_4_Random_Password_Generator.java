
import java.util.Random;
import java.util.Scanner;

public class Task_4_Random_Password_Generator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                     + "abcdefghijklmnopqrstuvwxyz"
                     + "0123456789"
                     + "@#$%&*";

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        System.out.println("Generated Password: " + password);

        sc.close();
    }
}