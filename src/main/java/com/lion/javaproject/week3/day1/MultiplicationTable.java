package com.lion.javaproject.week3.day1;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int j = 2; j <= 4; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n",j, i, i * j);
            }
            System.out.println();
        }
    }
}