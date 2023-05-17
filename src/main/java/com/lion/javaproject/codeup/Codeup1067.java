package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        if(val1 % 2 == 0)
            System.out.println("plus");
        else
            System.out.println("minus");
        if(val2 % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}