package com.lion.javaproject.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList<>();
        l1.add("Hello");
        l1.add(1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
//        l1.remove(0);
//        l1.remove(0);
        System.out.println(l1.isEmpty());

        System.out.println("-----------");
        for (var item : l1) {
            System.out.println(item);
//            System.out.println(item.split()); // 사용불가
        }
        int[] arr = new int[3];
        List<Integer> list1 = new ArrayList<>();

    }

}
