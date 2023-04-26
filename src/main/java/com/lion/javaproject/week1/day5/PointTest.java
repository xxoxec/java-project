package com.lion.javaproject.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        // 0.0의 점 만들기
        Point p1 = new Point();
        p1.x = 0; // x에 10이라는 값 할당
        p1.y = 0; // y에 20이라는 값 할당
        System.out.printf("x:%d, y:%d\n", p1.x, p1.y);
        System.out.printf("xy가 같은지? %s\n", p1.isSameXy());

        // System.out.printf("x:%d, y:%d", p1.x, p1.y);
        // System.out.println("Point: (" + p1.x + ", " + p1.y + ")");

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("xy가 같은지? %s\n", p2.isSameXy());

        // 또 다른 점 찍기
        Point p3 = new Point();
        p3.x = 3;
        p3.y = 2;
        System.out.printf("xy가 같은지? %s\n", p3.isSameXy());



    }
}
