package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] y = x.split("\\.");
        System.out.println(y[0]);
        System.out.println(y[1]);

    }
}