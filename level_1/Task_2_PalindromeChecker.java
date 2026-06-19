
import java.util.Scanner;

public class Task_2_PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Palindrome Checker =====");
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String original = word.toLowerCase();
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println(word + " is a Palindrome word.");
        } else {
            System.out.println(word + " is not a Palindrome word.");
        }

        sc.close();
    }
}