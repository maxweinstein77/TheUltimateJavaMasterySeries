package com.mweinstein;

public class EscapeSequences {

    public static void main(String[] args) {

        String message1 = "Hello \"Mosh\"";
        String message2 = "c:\\Windows\\...";
        String message3 = "c:\nWindows\\...";
        String message4 = "c:\tWindows\\...";
        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message3);
        System.out.println(message4);
    }
}
