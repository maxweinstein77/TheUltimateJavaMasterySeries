package com.mweinstein.p13_casting;

public class Main {

   public static void main(String[] args) {
      /**
       * Implicit/automatic casting: byte > short > int > long > float > double
       * - Any values stored in short var can be stored in int var
       *
       * Execution:
       * 1. Java looks at value of var (x) on line 15
       * 2. Allocates anonymous var somewhere in memory which will be an int
       * 3. Java will copy value of x into that memory space
       * 4. Then it will add x + 2
       */
      short x1 = 1; // 2 bytes
      int y1 = x1 + 2; // 4 bytes
      System.out.println(y1);

      double x2 = 1.1;
      double y2 = x2 + 2; // 2.0
      System.out.println(y2);

      // explicit casting (can only happen between compatible types
      double x3 = 1.1;
      int y3 = (int)x3 + 2; // 3
      System.out.println(y3);

      String x = "1.1";
      double y = Double.parseDouble(x) + 2;
      System.out.println(y);
   }
}