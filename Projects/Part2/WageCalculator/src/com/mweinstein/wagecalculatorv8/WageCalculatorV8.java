package com.mweinstein.wagecalculatorv8;

public class WageCalculatorV8 {

    public static void main(String[] args) {
        var employee = new Employee_for_V8(50_000, 20);
        Employee_for_V8.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}