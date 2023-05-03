package com.lion.javaproject.week3.day1.day2;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num) {
        while (num > 0) {
            if (num % 10 != 5 && num % 10 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 252;

        boolean r = isZeroOrFive(num);
            System.out.println(r);

            }
        }

