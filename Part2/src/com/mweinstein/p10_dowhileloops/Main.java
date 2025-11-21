package com.mweinstein.p10_dowhileloops;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      // While loop
      Scanner scanner = new Scanner(System.in);
      String input = "";
      while (!input.equals("quit")) {
         System.out.println("Input: ");
         input = scanner.next().toLowerCase();
         System.out.println(input);
      }

      // Do while loop
      do {
         System.out.println("Input: ");
         input = scanner.next().toLowerCase();
         System.out.println(input);
      } while (!input.equals("quit"));
   }
}