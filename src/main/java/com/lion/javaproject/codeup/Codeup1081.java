package com.lion.javaproject.codeup;

import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int frontDice = sc.nextInt();
        int backDice = sc.nextInt();
        for (int j = 1; j <= backDice; j++) {
            for (int i = 1; i <= frontDice; i++)
                System.out.printf("%d %d\n", j, i);
        }
    }
}
