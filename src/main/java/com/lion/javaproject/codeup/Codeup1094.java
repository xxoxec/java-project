package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int[] a = new int[n];
       for (int i = 0; i < n; i++) {
           int m = sc.nextInt();
           a[i] += m;
       }
       for (int j = n; j > 0; j--)
           System.out.print(a[j - 1] + " ");
    }
}
