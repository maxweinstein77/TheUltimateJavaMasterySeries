package com.mweinstein.wagecalculatorv6;

public class WageCalculatorV6 {

    public static void main(String[] args) {
        var employee = new Employee_for_V6(
                50_000, 20);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}