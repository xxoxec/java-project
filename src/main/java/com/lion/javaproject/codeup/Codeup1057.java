package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        if(val1 == val2) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

//        int val1 = 1;
//        int val2 = 0;
//        boolean result = val1 != val2;
//        System.out.printf("%d%n", !result ? 1 : 0);
    }
}