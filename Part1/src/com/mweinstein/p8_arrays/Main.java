package com.mweinstein.p8_arrays;

import java.util.Arrays;

public class Main {

   public static void main(String[] args) {

      // old way
      int[] numbers1 = new int[5];
      numbers1[0] = 1;
      numbers1[1] = 2;

      /*
      When you print array, Java returns string which is calculated based on
      address of object in memory.
      */
      System.out.println(numbers1);

      // return string representation of array
      System.out.println(Arrays.toString(numbers1));

      // new way
      int[] numbers2 = { 2, 3, 5, 1, 4 };
      Arrays.sort(numbers2); // Sort array
      System.out.println(numbers2.length);
      System.out.println(Arrays.toString(numbers2));
   }
}
