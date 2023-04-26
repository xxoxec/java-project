package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long c = sc.nextLong();
        System.out.println(a + b + c);
        System.out.printf("%.1f", (float) ( a + b + c ) / 3 );
    }
}