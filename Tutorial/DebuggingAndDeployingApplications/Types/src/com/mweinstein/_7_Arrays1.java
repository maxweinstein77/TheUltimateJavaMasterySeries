package com.mweinstein;

import java.util.Arrays;

public class _7_Arrays1 {

    public static void main(String[] args) {

        int[] numbers1 = new int[5];
        numbers1[0] = 1;
        numbers1[1] = 2;
        System.out.println(Arrays.toString(numbers1));

        int[] numbers2 = { 2, 3, 5, 1, 4 };
        System.out.println(numbers2.length);

        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
    }
}
