package com.lion.javaproject.babylion;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 한번 크기가 정해지면 나중에 바꿀 수 없음
//        int[] array;
//        array = new int[5]; // 기본타입이 아니므로 new
//        메모리 주소가 0 부터 시작하기때문에 인덱스 번호는 0부터 시작
//        int[] arr = new int[5];
//        int[] arr2 = new int[]{1,2,3,4,5}; // 초기화 방법
//        int[] arr3 = {1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));
//        arr2[0] = 100;
//        System.out.println(arr2[0]);
//        참조 타입은 기본적으로 null로 초기화 됨
//        null? 참조변수가 객체를 가리키지 않을 때를 명시하려고 쓰임
        String[] strArr = new String[5];
        System.out.println(Arrays.toString(strArr));

        Student[] students = new Student[3];
        System.out.println(Arrays.toString(students));
        Student st1 = new Student();
        st1.age = 10;
        st1.name = "학생1";
        students[0] = st1;
        students[1] = new Student();
        students[1].name = "학생2";
        System.out.println(Arrays.toString(students));
    }
}
