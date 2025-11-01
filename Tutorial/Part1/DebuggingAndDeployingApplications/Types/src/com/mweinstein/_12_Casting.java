package com.mweinstein;

public class _12_Casting {

    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        short x1 = 1;
        int y1 = x1 + 2;
        System.out.println(y1);

        double x2 = 1.1;
        double y2 = x2 + 2; // 2.0
        System.out.println(y2);

        // Explicit casting
        double x3 = 1.1;
        int y3 = (int)x3 + 2;
        System.out.println(y3);

        String x4 = "1";
        int y4 = Integer.parseInt(x4) + 2; // Convert string to integer
        System.out.println(y4);

        String x5 = "1";
        double y5 = Double.parseDouble(x5) + 2; // Convert string to double
        System.out.println(y5);
    }
}
