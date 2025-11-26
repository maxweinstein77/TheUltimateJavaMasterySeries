package com.mweinstein.p31_makingmethods;

public class Main {
   
   public static void main(String[] args) {
      greetUser("Max", "Weinstein");
   }

   public static void  greetUser(String firstName, String lastName) {
      System.out.println("Hello " + firstName + " " + lastName);
   }

   // // Return
   // public static String greetUser(String firstName, String lastName) {
   //    return "Hello " + firstName + " " + lastName;
}