package com.mweinstein;

import java.util.Scanner;

public class _10_BreakAndContinueStatements {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Input: ");
            input = scanner1.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}