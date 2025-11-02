package com.mweinstein;

public class _1_CreatingClasses {

    public static void main(String[] args) {
        var textBox1 = new _1_TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new _1_TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2);
    }
}
