package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        for (int i = 1; i <= val1; i++) {
            if (i % 3 != 0)
                System.out.print(i + " ");
            else
                System.out.print("X ");
        }
    }
}
