package com.mweinstein.p12_foreachloops;

public class Main {

    public static void main(String[] args) {
        String[] fruits = { "Apple", "Mango", "Orange" };

        // For loop (if you need index)
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        // For each loop
        for (String fruit : fruits)
            System.out.println(fruit);

        // Have to use for loop to go in reverse
        for (int i = fruits.length; i > 0; i--)
            System.out.println(fruits);
    }
}