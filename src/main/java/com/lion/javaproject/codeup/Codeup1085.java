package com.lion.javaproject.codeup;

import java.io.*;
import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float val1 = sc.nextFloat();
        float val2 = sc.nextFloat();
        float val3 = sc.nextFloat();
        float val4 = sc.nextFloat();
        System.out.printf("%.1f MB%n", val1 * val2 * val3 * val4 / 8 / 1024 /1024);
    }
}
