package com.mweinstein.p6_strings;

public class Main {

   public static void main(String[] args) {
      String message1 = "Hello World" + "!!";
      System.out.println(message1);

      System.out.println(message1.endsWith("!!"));
      System.out.println(message1.startsWith("!!"));
      System.out.println(message1.length());
      System.out.println(message1.indexOf("H"));
      System.out.println(message1.indexOf("sky"));
      System.out.println(message1.replace("!","*"));
      System.out.println(message1.toLowerCase());
      System.out.println(message1.toUpperCase());
      System.out.println(message1);

      String message2 = "  Hello World" + "!! ";
      System.out.println(message2.trim());
      System.out.println(message2);
   }
}

// Strings are immutable in java.