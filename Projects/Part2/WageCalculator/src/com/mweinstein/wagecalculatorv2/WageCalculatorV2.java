package com.mweinstein.wagecalculatorv2;

public class WageCalculatorV2 {

    public static void main(String[] args) {
        var employee = new Employee_for_V2();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);

        System.out.println(wage);
    }
}