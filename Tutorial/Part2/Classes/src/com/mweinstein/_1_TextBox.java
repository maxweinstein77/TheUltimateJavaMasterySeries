package com.mweinstein;

public class _1_TextBox {
    public String text = ""; // Field

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    @Override
    public String toString() {
        return text;
    }
}
