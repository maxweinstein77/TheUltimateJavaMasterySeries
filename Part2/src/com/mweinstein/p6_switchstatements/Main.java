package com.mweinstein.p6_switchstatements;

public class Main {

   public static void main(String[] args) {

      // If statement implementation
      String role1 = "admin";
      if (role1 == "admin")
         System.out.println("You're an admin");
      else if (role1 == "moderator")
         System.out.println("You're a moderator");
      else
         System.out.println("You're a guest");

      // Switch statement implementation (string form)
      String role2 = "admin";
      switch (role2) {
         case "admin":
            System.out.println("You're an admin");
            break;

         case "moderator":
            System.out.println("You're a moderator");

         default:
            System.out.println("You're a guest");
      }

      // Switch statement implementation (integer form)
      int role3 = 1;
      switch (role3) {
         case 1:
            System.out.println("You're an admin");
            break;

         case 2:
            System.out.println("You're a moderator");

         default:
            System.out.println("You're a guest");
      }
   }
}