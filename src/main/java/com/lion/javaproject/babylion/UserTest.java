package com.lion.javaproject.babylion;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
//        User user = new User();
//        // ~의
//        user.age = 10;
//        user.name = "아기사자";
//        user.printAge();
//        user.printName();

        // User의 이름과 나이 성별을 입력받아서 지정해주고 출력해보세요
        // User가 성인인지 아닌지 판별하는 메소드를 만들고 출력해보세요

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String sex = sc.next();
        int age = sc.nextInt();

        User user = new User();
        user.name = name;
        user.sex = sex;
        user.age = age;

        user.printage();
        user.PrintName();
        user.isAdult();
    }
}

