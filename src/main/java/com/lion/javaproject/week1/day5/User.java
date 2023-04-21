package com.lion.javaproject.week1.day5;

public class User {
    // 이름, 나이, 전화번호
    String name;
    String phoneNumber;
    int age;

    boolean isAdult() {
        return  age >= 18;
    }
}
