package com.lion.javaproject.week3.day1.day2;

public class While687 {
    public static void main(String[] args) {
        int n = 687;
        int answer = 0;

        while (n >0) {
            answer += n % 10;
            n /= 10;
        }

        System.out.println(answer);
    }
}