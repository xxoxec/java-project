package com.lion.javaproject.week3.day1.day3;

public class BreakEx {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i * i > 50) {
                break;

            }
            System.out.println(i);
        }
    }
}