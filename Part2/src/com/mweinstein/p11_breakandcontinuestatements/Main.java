package com.mweinstein.p11_breakandcontinuestatements;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // Old version
      Scanner scanner1 = new Scanner(System.in);
      String input = "";
      while (!input.equals("quit")) {
         System.out.println("Input: ");
         input = scanner1.next().toLowerCase();
         System.out.println(input);
      }

      // With if statement
      Scanner scanner2 = new Scanner(System.in);
      String input2 = "";
      while (!input2.equals("quit")) {
         System.out.println("Input: ");
         input2 = scanner2.next().toLowerCase();
         if (!input2.equals("quit"))
            System.out.println(input2);
      }

      // With break statement
      Scanner scanner3 = new Scanner(System.in);
      String input3 = "";
      while (!input3.equals("quit")) {
         System.out.println("Input: ");
         input3 = scanner3.next().toLowerCase();
         if (input3.equals("quit"))
            break;
         System.out.println(input3);
      }

      // With continue statement
      Scanner scanner4 = new Scanner(System.in);
      String input4 = "";
      while (!input4.equals("quit")) {
         System.out.println("Input: ");
         input4 = scanner4.next().toLowerCase();
         if (input4.equals("pass"))
            continue; // Moves control to beginning of loop
         if (input4.equals("quit"))
            break; // Terminates a loop
         System.out.println(input4);
      }

      // With continue statement (updated way)
      Scanner scanner5 = new Scanner(System.in);
      String input5 = "";
      while (true) { // Make sure to use break - o/w infinite loop
         System.out.println("Input: ");
         input5 = scanner5.next().toLowerCase();
         if (input5.equals("pass"))
            continue; // Moves control to beginning of loop
         if (input5.equals("quit"))
            break; // Terminates a loop
         System.out.println(input5);
      }
   }
}