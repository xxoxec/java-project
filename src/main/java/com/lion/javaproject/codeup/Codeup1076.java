package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        char y = 'a';
        while(y < x + 1) {
            System.out.printf(y + " ");
            y++;
        }
    }
}