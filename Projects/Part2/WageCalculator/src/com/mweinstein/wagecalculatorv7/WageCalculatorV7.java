package com.mweinstein.wagecalculatorv7;

public class WageCalculatorV7 {

    public static void main(String[] args) {
        new Employee_for_V7(10_000);
        var employee = new Employee_for_V7(
                50_000, 20);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}