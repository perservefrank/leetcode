package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-27
 **/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {

        int start=0;
        int startIndex=start;
        int end =nums.length-1;
        int result = nums.length;
        while (startIndex<end){
            while (startIndex<end && nums[startIndex] == nums[++startIndex]){
                result--;
            }
            if (nums[start] !=nums[startIndex]){
                nums[++start]=nums[startIndex];
            }
        }
        return result;
    }

    public static void main(String[] args) {
         int [] nums = {1,1};
        //  int [] nums = {1,1,2};
        //int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
