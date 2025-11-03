package com.mweinstein;

public class Employee_for_V2 {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate + extraHours);
    }
}
