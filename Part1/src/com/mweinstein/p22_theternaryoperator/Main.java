package com.mweinstein.p22_theternaryoperator;

public class Main {

   public static void main(String[] args) {

      // Amateur version
      int income1 = 120_000;
      String className1;
      if (income1 > 100_000)
         className1 = "First";
      else
         className1 = "Economy";

      // Better version
      int income2 = 120_000;
      String className2 = "Economy";
      if (income2 > 100_000)
         className2 = "First";

      // Even better version
      int income3 = 120_000;
      String className3 = income3 > 100_000 ? "First" : "Economy";
   }
}
