package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long m = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();
        for (int i = 1; i < n; i++)
            a = a * m + d;
            System.out.println(a);

        }
    }
