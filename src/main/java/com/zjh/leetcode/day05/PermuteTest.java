package com.zjh.leetcode.day05;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 * @author: jinheng.zhao
 * @create: 2020-11-10
 **/
public class PermuteTest {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        
        cal(resultList, null,nums);
        
        return resultList;
    }

    private static void cal(List<List<Integer>> resultList, Stack<Integer> stack, int[] nums) {
        if (nums.length<=0){
            resultList.add(new ArrayList<>(stack));
            return;
        }
        if (stack == null){
            stack =new Stack<>();
        }
        for(int i=0;i<nums.length;i++){
            stack.push(nums[i]);
            cal(resultList, stack,removeElement(nums,i));
            stack.pop();
        }
    }

    private static int[] removeElement(int[] nums, int index) {
        int[] newArr = new int[nums.length - 1];
        for(int i=0,j=0;i<nums.length;i++){
            if (nums[i]!=nums[index]){
                newArr[j]=nums[i];
                j++;
            }
        }
        return newArr;
    }


    public static void main(String[] args) {
        int [] arr={1,2,3};
        System.out.printf(permute(arr).toString());

    }
}
