package com.lion.javaproject.week1.day5;

import com.lion.javaproject.PrintHello;

import java.sql.SQLOutput;

public class ConstantEx {

    public final int MAX_LEVEL = 3;
    public static  final int MIN_LEVEL = 1;
    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
       // iVal = 2; 한번값을 지정하면 바꾸는 것 안됨
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello();

    }
}
