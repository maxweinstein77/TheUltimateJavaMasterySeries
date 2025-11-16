package com.mweinstein.p3_ifstatements;

public class Main {

   public static void main(String[] args) {
      int temp1 = 32;

      // Bad version
      if (temp1 > 30) {
         System.out.println("It's a hot day");
         System.out.println("Drink water");
      } else if (temp1 > 20 && temp1 <= 30) {
         System.out.println("Beautiful day");
      } else {
         System.out.println("Cold day");
      }

      int temp2 = 32;

      // Better version
      if (temp2 > 30) {
         System.out.println("It's a hot day");
         System.out.println("Drink water");
      }
      else if (temp2 > 20)
         System.out.println("Beautiful day");
      else
         System.out.println("Cold day");

   }
}