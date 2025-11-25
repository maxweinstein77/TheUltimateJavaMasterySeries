package com.mweinstein.p21_simplifyingifstatements;

public class Main {

   public static void main(String[] args) {

      // Okay version
      int income1 = 120_000;
      boolean hasHighIncome1;
      if (income1 > 100_00)
         hasHighIncome1 = true;
      else
         hasHighIncome1 = false;

      // Better version
      int income2 = 120_000;
      boolean hasHighIncome2 = (income2 > 100_000);
   }
}
