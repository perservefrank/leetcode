package com.zjh.leetcode.day05;

import java.util.*;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-18
 **/
public class FourSumTest {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length<4){
            return list;
        }
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if (i!=0 && nums[i]== nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if (j!=i+1 && nums[j]== nums[j-1]){
                    continue;
                }
                int leght = j+1 ;
                int right = nums.length-1;

                while(leght!=right &&leght<right){
                    int min= nums[i]+nums[j]+nums[leght]+nums[leght+1];
                    if (min>target){
                        break;
                    }
                    int max= nums[i]+nums[j]+nums[right]+nums[right-1];
                    if (max<target){
                        break;
                    }
                    int sum= nums[i]+nums[j]+nums[leght]+nums[right];
                    if (sum == target){
                        List<Integer> integers = Arrays.asList(nums[i], nums[j], nums[leght], nums[right]);
                        if (!set.contains(integers)){
                            list.add(integers);
                            set.add(integers);
                        }
                        while(leght !=right && nums[right] == nums[right-1]){
                            right--;
                        }
                        right--;
                    }else if (sum>target){

                        while(leght !=right && nums[right] == nums[right-1]){
                            right--;
                        }
                        right--;
                    }else {
                        while(leght !=right && nums[leght] == nums[leght+1]){
                            leght++;
                        }
                        leght++;
                    }
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        //int [] nums = {1, 0, -1, 0, -2, 2};
         int [] nums = {0, 0, 0, 0};
        //int [] nums = {-1,2,2,-5,0,-1,4};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}
