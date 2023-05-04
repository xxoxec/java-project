package com.lion.javaproject.babylion;

public class Character {
    // 멤버변수 ? 클래스 안에서 선언된 변수
    // 1. 클래스변수 (static 변수) - 스태틱 영역(메소드영역, 클래스영역)
    // 2. 인스턴스 변수 (전역변수) - 힙 영역에 올라감
    // 초기화 해주지 않아도 됨 , 자료형에 따라서 0이나 null로 알아서 초기화 해줌
    int level;
    static int maxLevel;

    public void levelup() {
        int level = 1;
        level = level + 1;
        System.out.println("레벨업!" + level);
    }

    public void levelup2() {
        level = level + 1;
        System.out.println("레벨업: " + level);
    }
}
