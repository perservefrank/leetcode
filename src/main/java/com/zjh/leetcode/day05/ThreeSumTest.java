package com.zjh.leetcode.day05;

import java.util.*;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-11
 **/
public class ThreeSumTest {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length<3){
            return result;
        }
        Arrays.sort(nums);
        Set<List<Integer>> hashSet = new HashSet<>();
        List<Integer> integers =null;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){

            }
        }

        return null;
    }

/*
solution one limit time exceeded;
public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> hashSet = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> integers =null;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int z=j+1;z<nums.length;z++){
                    int sum =nums[i]+nums[j]+nums[z];
                    if (sum==0){
                        int [] arr =  {nums[i], nums[j], nums[z]};
                        Arrays.sort(arr);
                        integers = Arrays.asList(arr[0],arr[1],arr[2]);
                        if (!hashSet.contains(integers)){
                            result.add(integers);
                            hashSet.add(integers);
                        }
                    }
                }
            }
        }
        return result;
    }*/

    public static void main(String[] args) {
         //int [] nums= {3, 0, -2, -1, 1, 2};
         int [] nums= {1,  1, -2};
        System.out.println(threeSum(nums));
    }


}
