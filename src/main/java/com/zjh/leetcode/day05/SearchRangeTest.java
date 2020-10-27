package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-10-19
 **/
public class SearchRangeTest {
    public static int[] searchRange(int[] nums, int target) {
        int [] result = {-1,-1};
        if (nums.length<=1){
            if (nums[0] == target){
                result[0]=1;
                return result;
            }else {
                return result;
            }
        }

        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid = (left+right)>>1;

            if (nums[mid]==target){
                    int leftIndex=mid;
                    int rightIndex=mid;
                    while((leftIndex>=left && nums[leftIndex]==target) || (rightIndex<=right && nums[rightIndex]==target)){
                        if (leftIndex>=left && nums[leftIndex]==target){
                            leftIndex--;
                        }
                        if (rightIndex<=right && nums[rightIndex]==target){
                            rightIndex++;
                        }
                    }
                    result[0]=++leftIndex;
                    result[1]=--rightIndex;
                    break;
            }else if (nums[mid]>target){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
           /* int [] data={5,7,7,8,8,10};
            int target= 8;*/
        int [] data={5,5};
        int target= 5;
        System.out.println(searchRange(data,target));
    }
}
