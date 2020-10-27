package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-10-12
 **/
public class RemoveElementTest {
    public static int removeElement(int[] nums, int val) {
        int result = nums.length;
        int start=0;
        int moveIndex=0;
        while (moveIndex<nums.length){
            while (moveIndex <nums.length && nums[moveIndex]==val){
                result--;
                moveIndex++;
            }

            if (moveIndex<nums.length && nums[moveIndex]!=val){
                nums[start]=nums[moveIndex];
                start++;
            }
            moveIndex++;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr ={3,2,2,3};
        int target=3;
        System.out.println(removeElement(arr,target));
    }
}
