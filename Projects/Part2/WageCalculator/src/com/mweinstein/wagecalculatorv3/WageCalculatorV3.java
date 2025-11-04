package com.mweinstein.wagecalculatorv3;

public class WageCalculatorV3 {

    public static void main(String[] args) {
        var employee = new Employee_for_V3();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);

        System.out.println(wage);
    }
}