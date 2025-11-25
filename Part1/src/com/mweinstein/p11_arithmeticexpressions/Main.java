package com.mweinstein.p11_arithmeticexpressions;

public class Main {

   public static void main(String[] args) {
      int result1 = 10 + 3;
      int result2 = 10 - 3;
      int result3 = 10 * 3;
      int result4 = 10 / 3;
      // expression - piece of code that generates a value
      double result5 = (double) 10 / (double) 3; // 10 and 3 are operands
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);

      int x1 = 1;
      int y1 = x1++; // post-fix
      System.out.println(x1);
      System.out.println(y1);

      int x2 = 1;
      int y2 = ++x2; // pre-fix
      System.out.println(x2);
      System.out.println(y2);

      // augmented/compound assignment operators
      int x3 = 1;
      x3 += 2;
      System.out.println(x3);

      int x4 = 1;
      x4 -= 2;
      System.out.println(x4);

      int x5 = 1;
      x5 *= 2;
      System.out.println(x5);

      int x6 = 1;
      x6 /= 2;
      System.out.println(x6);
   }
}