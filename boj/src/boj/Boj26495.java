package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Boj26495 {

   public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String num = br.readLine();
      int l = num.length();
      for (int i = 0; i < l; i++) {
         char n = num.charAt(i);
         switch (n) {

         case '0':
            System.out.println("0000");
            System.out.println("0  0");
            System.out.println("0  0");
            System.out.println("0  0");
            System.out.println("0000");
            if (i != l - 1) {
               System.out.println();
            }
            break;
         case '1':
            System.out.println("   1");
            System.out.println("   1");
            System.out.println("   1");
            System.out.println("   1");
            System.out.println("   1");
            if (i != l - 1) {
               System.out.println();
            }
            break;
         case '2':
            System.out.println("2222");
            System.out.println("   2");
            System.out.println("2222");
            System.out.println("2");
            System.out.println("2222");
            if (i != l - 1) {
               System.out.println();
            }
            break;
         case '3':
            System.out.println("3333");
            System.out.println("   3");
            System.out.println("3333");
            System.out.println("   3");
            System.out.println("3333");
            if (i != l - 1) {
               System.out.println();
            }
            break;
         case '4':
            System.out.println("4  4");
            System.out.println("4  4");
            System.out.println("4444");
            System.out.println("   4");
            System.out.println("   4");
            if (i != l - 1) {
               System.out.println();
            }
            break;
         case '5':
            System.out.println("5555");
            System.out.println("5");
            System.out.println("5555");
            System.out.println("   5");
            System.out.println("5555");
            if (i != l - 1) {
               System.out.println();
            }
            break;
         case '6':
            System.out.println("6666");
            System.out.println("6");
            System.out.println("6666");
            System.out.println("6  6");
            System.out.println("6666");
            if (i != l - 1) {
               System.out.println();
            }
            break;
         case '7':
            System.out.println("7777");
            System.out.println("   7");
            System.out.println("   7");
            System.out.println("   7");
            System.out.println("   7");
            if (i != l - 1) {
               System.out.println();
            }
            break;
         case '8':
            System.out.println("8888");
            System.out.println("8  8");
            System.out.println("8888");
            System.out.println("8  8");
            System.out.println("8888");
            if (i != l - 1) {
               System.out.println();
            }
            break;
         case '9':
            System.out.println("9999");
            System.out.println("9  9");
            System.out.println("9999");
            System.out.println("   9");
            System.out.println("   9");
            if (i != l - 1) {
               System.out.println();
            }
            break;
         }

      }

   }

}