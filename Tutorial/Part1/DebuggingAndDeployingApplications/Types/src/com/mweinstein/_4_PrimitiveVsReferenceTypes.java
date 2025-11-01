package com.mweinstein;

import java.awt.*;

public class _4_PrimitiveVsReferenceTypes {

    public static void main(String[] args) {

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
