package com.mweinstein;

public class ArithmeticExpressions {

    public static void main(String[] args) {
        double result = (double)10 / (double)3;
        System.out.println(result);

        int x1 = 1;
        int y1 = x1++;
        System.out.println(x1);
        System.out.println(y1);

        int x2 = 1;
        int y2 = ++x2;
        System.out.println(x2);
        System.out.println(y2);

        int x3 = 1;
        x3 += 2;
        System.out.println(x3);
    }
}
