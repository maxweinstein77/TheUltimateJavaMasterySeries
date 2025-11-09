package com.mweinstein.p7_escapesequences;

public class Main {

   public static void main(String[] args) {
      String message1 = "Hello \"Max\"";
      System.out.println(message1);

      // c:\Windows\...
      String message2 = "c:\\Windows\\...";
      System.out.println(message2);

      String message3 = "c:\nWindows\\...";
      System.out.println(message3);

      String message4 = "c:\tWindows\\...";
      System.out.println(message4);
   }
}