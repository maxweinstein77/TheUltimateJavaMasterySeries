package com.mweinstein;

import java.util.Scanner;

public class _15_InputReading {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Age: ");
        byte age = scanner1.nextByte();
        System.out.println("You are " + age);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner2.nextLine().trim();
        System.out.println("You are " + name);
    }
}
