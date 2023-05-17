package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(true) {
            if(sum >= num) {
                System.out.println(sum);
                break;
            }
            i++;
            sum += i;
        }
    }
}
