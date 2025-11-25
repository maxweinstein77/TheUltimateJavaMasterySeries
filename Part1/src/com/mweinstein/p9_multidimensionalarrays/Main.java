package com.mweinstein.p9_multidimensionalarrays;

import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
      // 2D
      int[][] numbers1 = new int[2][3]; // 2 x 3
      numbers1[0][0] = 1;
      System.out.println(Arrays.deepToString(numbers1));

      // 3D
      int[][][] numbers2 = new int[2][3][5]; // 2 x 3 x 5
      numbers2[0][0][0] = 1;
      System.out.println(Arrays.deepToString(numbers2));

      // 2D (updated way)
      int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } };
      System.out.println(Arrays.deepToString((numbers)));
   }
}
