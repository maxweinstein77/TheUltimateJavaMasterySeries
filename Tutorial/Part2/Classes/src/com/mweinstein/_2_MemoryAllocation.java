package com.mweinstein;

public class _2_MemoryAllocation {

    public static void main(String[] args) {
        var textBox1 = new _1_TextBox();
        var textBox2 = textBox1;
        textBox2.setText("Hello World");
        System.out.println(textBox1.text);
    }
}
