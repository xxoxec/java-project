package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            a[i] += m;
        }
        for (int j = 0; j > n - 1; j++)
            if (a[j] < a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
           System.out.println(a[n - 1]);
    }
}
