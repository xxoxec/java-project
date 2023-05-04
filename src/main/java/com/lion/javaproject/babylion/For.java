package com.lion.javaproject.babylion;

public class For {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0;  i < arr2.length; i++) {
            for (int j = 0; j < arr2[1].length; j++) {
//                System.out.println(arr2[i][j]);
                System.out.printf("| arr[%d][%d] = %d |", i, j ,arr2[i][j]);
                if(j == arr2[i].length -1) {
                    System.out.println();
                }
            }
        }
    }
}
