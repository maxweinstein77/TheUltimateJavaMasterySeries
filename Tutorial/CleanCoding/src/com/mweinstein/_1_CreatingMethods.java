package com.mweinstein;

public class _1_CreatingMethods {

    public static void main(String[] args) {
        String message = greetUser("Max", "Weinstein");
    }

    public static String greetUser(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}