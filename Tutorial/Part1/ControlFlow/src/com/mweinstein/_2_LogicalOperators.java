package com.mweinstein;

public class _2_LogicalOperators {

    public static void main(String[] args) {
        int temperature1 = 22;
        boolean isWarm1 = temperature1 > 20 && temperature1 < 30;
        System.out.println(isWarm1);

        int temperature2 = 12;
        boolean isWarm2 = temperature2 > 20 && temperature2 < 30;
        System.out.println(isWarm2);

        boolean hasHighIncome1 = true;
        boolean hasGoodCredit1 = true;
        boolean isEligible1 = hasHighIncome1 || hasGoodCredit1;

        boolean hasHighIncome2 = true;
        boolean hasGoodCredit2 = true;
        boolean isEligible2 = hasHighIncome2 || hasGoodCredit2;

        boolean hasHighIncome3 = true;
        boolean hasGoodCredit3 = true;
        boolean hasCriminalRecord = false;
        boolean isEligible3 = (hasHighIncome3 || hasGoodCredit3) && !hasCriminalRecord;

    }
}
