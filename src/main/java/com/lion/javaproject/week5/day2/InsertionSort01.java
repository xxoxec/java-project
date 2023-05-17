package com.lion.javaproject.week5.day2;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[]arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
                if((isAscending ? arr[j-1] - arr[j] : arr[j] - arr[j-1]) >0) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
            }else {
                break;

            }
            }
        }
        return arr;
    }
    public int[] sort(int[] arr) {
        return sort(arr, true);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertionSort01 is = new InsertionSort01();
        System.out.println(Arrays.toString(arr));

    }
}