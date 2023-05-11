package com.lion.javaproject.codeup;


import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() -1;
            int y = sc.nextInt() -1;

            for (int j = 0; j < l; j++) {
                if(d == 0) {
                    arr[x][y + j] = 1;
                } else {
                    arr[x + j][y] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}