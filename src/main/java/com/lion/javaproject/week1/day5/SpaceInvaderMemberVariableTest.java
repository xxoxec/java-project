package com.lion.javaproject.week1.day5;

public class SpaceInvaderMemberVariableTest {
    int location; // 멤버변수

    public void moveLeft() {
        location = location - 1;
    }

    public void moveLeftAndPrint() {
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }

    public void moveRight() {
        location = location + 1;
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        System.out.println(simv.location);

        simv.moveLeft(); // 왼쪽으로 이동 -1
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.printf("최종 위치: %d", simv.location);
    }


}
