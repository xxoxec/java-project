package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt(16);
        for (int i = 1; i <= 16; i++) {
            System.out.printf("%X * %X = %X%n", val1, i , val1 * i);
        }
    }
}
