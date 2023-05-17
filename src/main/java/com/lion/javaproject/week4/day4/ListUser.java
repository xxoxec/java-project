package com.lion.javaproject.week4.day4;

import com.lion.javaproject.week1.day5.User;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        users.add(user1);

        for ( User user : users ) {
            System.out.printf("%s님의 전화 번호는 %s입니다.%n", user.getName(), user.getPhoneNumber());
        }
    }
}
