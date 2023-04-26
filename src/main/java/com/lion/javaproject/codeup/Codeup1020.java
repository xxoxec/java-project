package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String[] y = x.split("-");

        System.out.print(y[0] + y[1]);

    }
}