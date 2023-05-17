package com.lion.javaproject.week1.day5;

public class User {
    // 이름, 나이, 전화번호
    private String name;
    private String phoneNumber;
    private int age;


    public User() {
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    boolean isAdult() {

        return  age >= 18;
    }
}
