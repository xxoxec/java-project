package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char val1 = sc.next().charAt(0);
        switch (val1) {
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            default:
                System.out.println("fall");

        }
    }
}