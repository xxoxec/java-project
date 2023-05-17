package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
           for (int i : arr) {
               System.out.println(i);
        }
    }
}