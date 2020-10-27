package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-10-14
 **/
public class SearchInsertTest {
    public static int searchInsert(int[] nums, int target) {
        if (nums[0]>=target){
            return 0;
        }
        if (nums[nums.length-1]<target){
            return nums.length;
        }

        int start=0;
        int end=nums.length-1;
        while (start<end){
            int mid=(start+end)>>1;
            if (nums[mid]>target){
                end=mid-1;
                if (nums[end]<target){
                    return end+1;
                }else {
                    return end;
                }
            }else if (nums[mid]<target){
                start=mid+1;
                if (nums[start]>=target){
                    return start;
                }
            }else {
                return mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] arr={1,2};
        int tartget=2;
        System.out.println(searchInsert(arr,tartget));

    }
}
