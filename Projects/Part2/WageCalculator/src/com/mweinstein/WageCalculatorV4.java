package com.mweinstein;

public class WageCalculatorV4 {

    public static void main(String[] args) {
        var employee = new Employee_for_V4();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}