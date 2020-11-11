package com.zjh.leetcode.day05;

import java.util.*;

/**
 * @author: jinheng.zhao
 * @create: 2020-11-09
 **/
public class TrapTest {
    public static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int sum=0 , current=0;
        while (current<height.length){
            while (!stack.isEmpty() && height[current]>height[stack.peek()]){
                int top = stack.pop();
                if (stack.isEmpty()){
                    break;

                }
                int distance = current - stack.peek() - 1;
                int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
                sum += distance * bounded_height;
            }
            stack.add(current++);
        }
        return sum;
    }



    public static void main(String[] args) {
        int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }

}
