import java.io.*;
import java.util.Scanner;

public class Task_3_FileEncryptionDecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter input file path: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file path: ");
        String outputFile = sc.nextLine();

        int key = 3;

        try {
            FileReader fr = new FileReader(inputFile);
            FileWriter fw = new FileWriter(outputFile);

            int data;
            while ((data = fr.read()) != -1) {
                if (choice == 1) {
                    fw.write(data + key);
                } else {
                    fw.write(data - key);
                }
            }

            fr.close();
            fw.close();

            System.out.println("File processed successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}