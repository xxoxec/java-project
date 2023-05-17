package com.lion.javaproject.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java {
    public static void main(String[] args) {

    }
        public void plus() throws IOException {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            System.out.println(br.read() + br.read());
        }
    }
