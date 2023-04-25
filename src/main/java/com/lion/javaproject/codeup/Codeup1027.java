package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String[] y = x.split("\\.");
        int y1 = Integer.parseInt(y[2]);
        int y2 = Integer.parseInt(y[1]);
        int y3 = Integer.parseInt(y[0]);
        System.out.printf("%02d-%02d-%04d", y1, y2, y3);

    }
}