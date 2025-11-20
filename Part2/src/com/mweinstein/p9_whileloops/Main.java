package com.mweinstein.p9_whileloops;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      // For loop
      for (int i = 5; i > 0; i--)
         System.out.println("Hello World " + i);

      // While loop
      int i = 0;
      while (i > 0) {
         System.out.println("Hello World " + i);
         i--;
      }

      /**
       * Wrong version:
       *
       * String input = "";
       *    while (input != "quit")
       *
       * Input is a string which is a reference type, and we cannot use
       * comparison operators between reference types because these
       * operators will compare the address of our string objects,
       * not their value.
       */

      // Correct version
      Scanner scanner = new Scanner(System.in);
      String input = "";
      while (!input.equals("quit")) {
         System.out.println("Input: ");
         input = scanner.next().toLowerCase();
         System.out.println(input);
      }
   }
}



