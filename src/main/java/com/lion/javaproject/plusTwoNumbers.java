package com.lion.javaproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class plusTwoNumbers {
    public void plusTwoNumbers() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); // 카트 가지고 오기
        System.out.println(br.readLine() + br.readLine());
    }


}
