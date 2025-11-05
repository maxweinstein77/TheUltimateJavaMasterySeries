package com.mweinstein.wagecalculatorv5;

public class WageCalculatorV5 {

    public static void main(String[] args) {
        var employee = new Employee_for_V5(
                50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}