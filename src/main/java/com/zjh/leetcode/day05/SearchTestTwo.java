package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-11-06
 **/
public class SearchTestTwo {
    public static boolean search(int[] nums, int target) {
        if (nums == null || nums.length==0){
            return false;
        }
        int left=0;
        int right=nums.length-1;

        while (left<=right){
            int mid = (left+right)>>1;
            if (nums[mid] == target){
                return true;
            }
            if (nums[left] == nums[mid]){
                left++;
                continue;
            }
            if (nums[left]<nums[mid]){
                if (target<nums[mid]){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }else {
                if (target<nums[mid]){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
       /* int [] arr={2,5,6,0,0,1,2};
        int target=0;*/
        int [] arr={1,1};
        int target=0;
        System.out.printf(String.valueOf(search(arr, target)));
    }
}
