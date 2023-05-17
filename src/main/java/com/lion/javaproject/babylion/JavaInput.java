package com.lion.javaproject.babylion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void read() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
       // System.out.println(is.read());
       // System.out.println(is.read());

        System.out.println(br.readLine());

    }
}