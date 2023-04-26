package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        int a = (int) x + 1;
        x = (char) a;
        System.out.print(x);

//        char c= sc.next().charAt(0);
//        c++;
//        System.out.println(c);
    }
}