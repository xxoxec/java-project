package com.lion.javaproject.codeup;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Codeup1097 {
    public static void main(String[] args) throws IOException {

        int[][] arr = new int[19][19];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 19; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 19; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
        int reverseCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < reverseCount; i++) {
            String[] location = br.readLine().split(" ");
            int x = Integer.parseInt(location[0]) -1;
            int y = Integer.parseInt(location[1]) -1;

            for (int j = 0; j < 19; j++) {
                arr[x][j] = arr[x][j] == 1 ? 0 : 1;
            }
            for (int j = 0; j < 19; j++) {
                arr[j][y] = arr[j][y] == 1 ? 0 : 1;
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
