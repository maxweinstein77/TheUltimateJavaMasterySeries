package com.mweinstein.p15_formattingnumbers;

import java.text.NumberFormat;

public class Main {

   public static void main(String[] args) {
      NumberFormat currency = NumberFormat.getCurrencyInstance(); // factory method
      String result1 = currency.format(1234567.891);
      System.out.println(result1);

      // without method chaining
      NumberFormat percent = NumberFormat.getPercentInstance(); // factory method
      String result2 = percent.format(0.1);
      System.out.println(result2);

      // with method chaining
      String result3 = NumberFormat.getPercentInstance().format(0.1);
      System.out.println(result3);
   }
}
