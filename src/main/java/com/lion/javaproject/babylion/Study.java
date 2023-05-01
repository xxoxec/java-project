package com.lion.javaproject.babylion;

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        // %s 정수형
        // %f 실수형
        // System.out.println("안녕" + " 아기사자반" + "ㅎㅎ");
        // System.out.printf("%s\n, %s %s", "안녕","아기사자반", "ㅎㅎ");

        Scanner sc = new Scanner(System.in);
        System.out.printf("%.1f", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat())/3);

    }
}
