package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-10-16
 **/
public class SearchTest {

    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

         while (left<=right){
             int mid = (left+right)>>1;
             if (nums[mid] == target){
                 return mid;
             }

             if (target<=nums[right]){
                 if (nums[mid]<=nums[right]){
                     if (nums[mid]>target){
                         right = mid-1;
                     }else {
                         left = mid+1;
                     }
                 }else {
                     left=mid+1;
                 }
             }else {
                 if (nums[mid]>=nums[left]){
                     if (nums[mid]>target){
                         right = mid-1;
                     }else {
                         left = mid+1;
                     }
                 }else {
                     right = mid-1;
                 }
             }
         }
        return -1;
    }

    public static void main(String[] args) {
        /*    int [] arr = {4,5,6,7,0,1,2};
            int target = 0;*/
            int [] arr = {3,1};
            int target = 3;
        System.out.println(search(arr, target));
    }
}
