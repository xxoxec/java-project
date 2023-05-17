package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String[] y = x.split(":");
        int a = Integer.parseInt(y[1]);
        System.out.print(a);

    }
}