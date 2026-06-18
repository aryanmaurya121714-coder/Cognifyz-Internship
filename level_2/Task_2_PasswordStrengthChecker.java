// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Task_2_PasswordStrengthChecker {
   public Task_2_PasswordStrengthChecker() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter password: ");
      String var2 = var1.nextLine();
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      for(char var10 : var2.toCharArray()) {
         if (Character.isUpperCase(var10)) {
            var3 = true;
         } else if (Character.isLowerCase(var10)) {
            var4 = true;
         } else if (Character.isDigit(var10)) {
            var5 = true;
         } else {
            var6 = true;
         }
      }

      int var11 = 0;
      if (var2.length() >= 8) {
         ++var11;
      }

      if (var3) {
         ++var11;
      }

      if (var4) {
         ++var11;
      }

      if (var5) {
         ++var11;
      }

      if (var6) {
         ++var11;
      }

      if (var11 == 5) {
         System.out.println("Strong Password");
      } else if (var11 >= 3) {
         System.out.println("Medium Password");
      } else {
         System.out.println("Weak Password");
      }

   }
}
