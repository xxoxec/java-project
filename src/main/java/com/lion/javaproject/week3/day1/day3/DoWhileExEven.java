package com.lion.javaproject.week3.day1.day3;

import java.util.Scanner;

public class DoWhileExEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("짝수를 입력하세요: ");
            input = scanner.nextInt();
        } while (input % 2 != 0);
        System.out.println("올바른 짝수가 입력되었습니다: " + input);
    }
}