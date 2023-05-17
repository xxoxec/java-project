package com.lion.javaproject.week1.day5;

public class SpaceInvadersMemberVariable {
    int location; // 멤버 변수 선언
    public void moveLeft() { // 왼쪽으로 이동하는 메소드
        location = location - 1; // 기존 값에 -1
        System.out.printf("moveLeft: %d\n", location);
    }
    public void moveRight() { // 오른쪽으로 이동하는 메소드
        location = location + 1; // 기존 값에 +1
        System.out.printf("moveRight: %d\n", location);

    }
    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft(); // 왼쪽으로 이동 -1
        simv.moveRight(); // 오른쪽으로 이동 +1
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
    }


}
