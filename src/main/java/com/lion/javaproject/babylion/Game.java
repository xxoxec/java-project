package com.lion.javaproject.babylion;

public class Game {
    public static void main(String[] args) {
        Character character = new Character();
        character.levelup2();
        character.levelup2();
        character.levelup2();
        // new를 써서 클래스를 사용하고 나면 메모리에서 제거가 됨
        // 힙 영역에서 제거가 됨
        // 누가 제거? JVM에 탑재된 가비지 컬렉터가 카비지 컬렉션

    }
}
