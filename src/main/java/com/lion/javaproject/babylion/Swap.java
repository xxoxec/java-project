package com.lion.javaproject.babylion;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        // 첫번째와 두번째 바꿔보기

        int[] arr = {1,2,3,4,5};
        int temp = 0;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr));

    }
}
