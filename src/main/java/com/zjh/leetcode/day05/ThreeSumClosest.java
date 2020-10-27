package com.zjh.leetcode.day05;

import java.util.Arrays;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-15
 **/
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++) {

            int left = i + 1;
            int right = nums.length - 1;
            while (left != right) {
                int min =nums[i]+nums[left]+nums[left+1];
                if (min>target){
                    if(Math.abs(result - target)>Math.abs(min - target)){
                        result = min;
                    }
                    break;
                }

                int max = nums[i]+nums[right-1]+nums[right];
                if(max<target){
                    if(Math.abs(result - target)>Math.abs(max - target)){
                        result = max;
                    }
                    break;
                }

                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(result - target)>=Math.abs(sum - target)){
                    result=sum;
                }
                if(sum == target || result == target){
                    return result;
                }
                if(sum>target){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int [] nums = {-1,2,1,-4};
        // int [] nums = {1,6,9,14,16,70};
         int [] nums = {1,1,-1,-1,3};
        int target = -1;
        System.out.println(threeSumClosest(nums, target));
    }
}
