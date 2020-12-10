package com.zjh.leetcode.day05;

import java.util.Arrays;

/**
 * @author: jinheng.zhao
 * @create: 2020-11-11
 **/
public class RotateTest {
    public static void rotate(int[][] matrix) {
        rotate(matrix,0,matrix[0].length-1);
    }

    private static void rotate(int[][] matrix, int left, int right) {

    }

    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
