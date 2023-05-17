package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        System.out.println((val1 < val2 ? val1 : val2) < val3 ? ( val1 < val2 ? val1 : val2) : val3);

//        int val1 = sc.nextInt();
//        int val2 = sc.nextInt();
//        int val3 = sc.nextInt();
//
//        int min = val1;
//        min = val2 < min ? val2 : min;
//        min = val3 > min ? val3 : min;
//        System.out.println(min);

    }
}