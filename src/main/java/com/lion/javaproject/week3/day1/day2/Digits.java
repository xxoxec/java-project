package com.lion.javaproject.week3.day1.day2;

public class Digits {
    public static void main(String[] args) {
        int num = 45634;
        // 자릿수만큼 반복
        int digits = 0;

        while (num >0) {
            num = num / 10;
            digits++;
        }
        System.out.println(digits);
    }
}