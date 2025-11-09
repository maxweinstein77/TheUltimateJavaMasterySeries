package com.mweinstein.p5_primitivevsreferencetypes;

import java.awt.*;

public class Main {

   public static void main(String[] args) {

      // primitive types
      byte x = 1;
      byte y = x;
      x = 2;
      System.out.println(y);

      // reference types
      Point point1 = new Point(1, 1);
      Point point2 = point1;
      point1.x = 2;
      System.out.println(point2);
   }
}

/**
 * When we declare a primitive variable, value we assign to variable will be
 * stored in that memory location. But when we use reference type, our
 * variable is going to hold the address of that point object in memory,
 * not the actual point object.
 *
 * Reference types don't store actual values. They store a reference to an object
 * somewhere in the memory.
 *
 * Primitive types copied by their value, and these values are completely
 * independent of each other.
 * Reference types copied by their references.
 */
