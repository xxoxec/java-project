package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for( int i = 1; i <= num; i++) {
            if(i % 3 ==0)
                continue;
            System.out.println(i + " ");
        }
    }
}
