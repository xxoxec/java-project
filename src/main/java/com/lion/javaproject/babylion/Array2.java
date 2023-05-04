package com.lion.javaproject.babylion;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        arr[1][1] = 100;
        System.out.println(arr[1][1]);
        System.out.println(Arrays.deepToString(arr));
    }
}
