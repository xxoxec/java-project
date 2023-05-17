package com.lion.javaproject.babylion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class User {
    String name;
    int age;
    String sex;
    public void printage() {
        System.out.println(age);
    }

    public void PrintName() {
        System.out.println(name);
    }

    public void isAdult() {
        if(age >= 18) {

            System.out.println("성인입니다.");
        } else {
            System.out.println("아기입니다.");
        }
    }

}
