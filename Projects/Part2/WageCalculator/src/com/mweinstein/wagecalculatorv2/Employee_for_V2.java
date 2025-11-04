package com.mweinstein.wagecalculatorv2;

public class Employee_for_V2 {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
