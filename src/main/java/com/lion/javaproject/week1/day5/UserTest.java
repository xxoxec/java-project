package com.lion.javaproject.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User kyungeun = new User();
        kyungeun.name = "경은";
        kyungeun.phoneNumber = "010-0000-1234";
        kyungeun.age = 36;

        User su = new User();
        su.name = "수";
        su.phoneNumber = " 010-0000-1235";
        su.age = 18;

        System.out.printf("%s님은 성인입니까 ? %s\n", kyungeun.name, kyungeun.isAdult());
        System.out.printf("%s님은 성인입니까 ? %s\n", su.name, su.isAdult());
    }

}