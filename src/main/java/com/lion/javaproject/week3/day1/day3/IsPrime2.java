package com.lion.javaproject.week3.day1.day3;

public class IsPrime2 {
    public static void main(String[] args) {
        int num = 991;
        boolean isPrime = true;
        for (int i = 0; i * i<= num ; i++) {
            if(num % i == 0 ) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
