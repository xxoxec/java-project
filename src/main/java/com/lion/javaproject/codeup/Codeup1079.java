package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            char a = sc.next().charAt(0);
            if(a == 'q') {
                System.out.print('q');
                break;
            }
            System.out.print(a + " ");
            }
        }
    }
