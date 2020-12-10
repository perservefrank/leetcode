package com.zjh.leetcode.day05;

/**
 *
 * @author: jinheng.zhao
 * @create: 2020-11-06
 **/
public class RemoveDuplicatesTest {
    public static int removeDuplicates(int[] nums){
        int index=1;
        int indexResult=0;
        int equestCount=1;
        lop:while (index<nums.length){
            while (index<nums.length && nums[indexResult]==nums[index]){
                if (equestCount<2){
                    indexResult++;
                    nums[indexResult]=nums[index];
                }
                equestCount++;
                index++;
                if(index>=nums.length){
                    break lop;
                }
            }

            indexResult++;
            if(index<nums.length){
                nums[indexResult]=nums[index];
            }
            equestCount=1;
            index++;
        }

        return ++indexResult;
    }

    public static void main(String[] args) {
          int [] arr={1,1,1,2,2,3};
        //int [] arr={0,0,1,1,1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
