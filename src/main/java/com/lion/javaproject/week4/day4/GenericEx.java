package com.lion.javaproject.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("bye");
        strList.add("1");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        for (String item : strList) {
            System.out.println(item.split(" "));
        }

    }
}
