package com.lion.javaproject.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User kyungeun = new User();
        kyungeun.setName("경은");
        kyungeun.setPhoneNumber("010-0000-1234");
        kyungeun.setAge(36);

        User su = new User();
        su.setName("수");
        su.setPhoneNumber(" 010-0000-1235");
        su.setAge(18);

        System.out.printf("%s님은 성인입니까 ? %s\n", kyungeun.getName(), kyungeun.isAdult());
        System.out.printf("%s님은 성인입니까 ? %s\n", su.getName(), su.isAdult());
    }

}