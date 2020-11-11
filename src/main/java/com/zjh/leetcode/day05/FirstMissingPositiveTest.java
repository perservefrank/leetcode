package com.zjh.leetcode.day05;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author: jinheng.zhao
 * @create: 2020-10-27
 **/
public class FirstMissingPositiveTest {
 /*   public static int firstMissingPositive(int[] nums) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            treeSet.add(nums[i]);
        }

        Iterator<Integer> iterator = treeSet.iterator();
        int temp=1;
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next>temp){
                return temp;
            }else {
                if (next>=0){
                    temp=next+1;
                }
            }
        }
        return temp;
    }*/

    public static int firstMissingPositive(int[] nums) {
        int length= nums.length;
        int startIndex=1;
        while(startIndex<=length){
            if(nums[startIndex-1]!=startIndex){
                if (nums[startIndex-1]>nums.length || nums[startIndex-1]<=0){
                    startIndex++;
                }else {
                    int temp=nums[nums[startIndex-1]-1];
                    nums[nums[startIndex-1]-1]=nums[startIndex-1];
                    if (temp<0){
                        nums[startIndex-1]=-1;
                        startIndex++;
                    }else {
                        if (nums[startIndex-1]==temp){
                            startIndex++;
                        }else {
                            nums[startIndex-1]=temp;
                        }
                    }
                }
            }else {
                startIndex++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if (nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void main(String[] args) {
        // int [] arr={3,4,-1,1};
        int [] arr={1,1};
        System.out.println(firstMissingPositive(arr));
    }
}
