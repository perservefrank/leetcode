package com.zjh.leetcode.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: jinheng.zhao
 * @create: 2020-10-23
 **/
public class CombinationSumTest {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();

        for(int i=0;i<candidates.length;i++){
            combinnation(result , null,i, candidates,target, 0);
        }
        return result;
    }

    private static void combinnation(List<List<Integer>> result, List<Integer> temp,int indexOne,int[] candidates, int target, int tempTarget) {
        if (temp==null){
            temp = new ArrayList<>();
        }

        int value = candidates[indexOne];
        temp.add(value);
        int size = temp.size();
        tempTarget+=value;
        if (tempTarget>=target){
            if (tempTarget==target){
                List<Integer> list = new ArrayList<>();
                list.addAll(temp);
                result.add(list);
            }
            return;
        }

        if (indexOne<=candidates.length){
            for(int i=indexOne;i<candidates.length;i++){
                combinnation(result,temp,i,candidates,target,tempTarget);
                if (tempTarget<target && size>=0){
                    temp.remove(size);
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr= {2,3,5,8};
        int target = 8;
        System.out.println(combinationSum(arr,target));
    }

}
