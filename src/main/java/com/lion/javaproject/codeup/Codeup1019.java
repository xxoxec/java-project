package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String[] y = x.split("\\.");
        int y0 = Integer.parseInt(y[0]);
        int y1 = Integer.parseInt(y[0]);
        int y2 = Integer.parseInt(y[0]);

        System.out.printf("%04d.%02d.%02d", y0,y1,y2);

    }
}