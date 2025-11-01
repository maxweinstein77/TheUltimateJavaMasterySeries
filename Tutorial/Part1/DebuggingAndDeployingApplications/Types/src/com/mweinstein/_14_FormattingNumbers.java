package com.mweinstein;

import java.text.NumberFormat;

public class _14_FormattingNumbers {

    public static void main (String[] arg) {
        NumberFormat currency1 = NumberFormat.getCurrencyInstance();
        String result = currency1.format(1234567.891);
        System.out.println(result);

        String result2 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result2);
    }
}
