package com.mweinstein.p16_readinginput;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scanner1 = new Scanner(System.in);
      System.out.print("Age: ");
      byte age = scanner1.nextByte(); // can only parse byte values
      // implicit type conversion (byte --> string)
      System.out.println("You are " + age);

      Scanner scanner2 = new Scanner(System.in);
      System.out.print("Name: ");
      String name1 = scanner2.next();
      System.out.println("You are " + name1);

      Scanner scanner3 = new Scanner(System.in);
      System.out.print("Name: ");
      String name2 = scanner3.nextLine();
      System.out.println("You are " + name2);

      Scanner scanner4 = new Scanner(System.in);
      System.out.print("Name: ");
      String name3 = scanner4.nextLine().trim();
      System.out.println("You are " + name3);
   }
}
