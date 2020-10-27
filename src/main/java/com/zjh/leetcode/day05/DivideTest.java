package com.zjh.leetcode.day05;

import javax.swing.text.MaskFormatter;

/**
 * @author: jinheng.zhao
 * @create: 2020-10-13
 **/
public class DivideTest {
/*    public static int divide(int dividend, int divisor) {
        int result = 0;
        if ((dividend>0 && divisor>0)){
            result= calPlus(dividend, divisor);
        }else if (dividend<0 && divisor<0){
            result= calMinus(dividend, divisor);
        }else if (dividend>0 && divisor<0){
            result= calPlus(dividend, Math.abs(divisor));
            result=0-result;
        }else if (dividend<0 && divisor>0){
            result= calPlus(0-dividend, divisor);
            result=0-result;
        }
        return result;
    }
    public static int calPlus(int dividend, int divisor){
        int result=0;
        int temp=divisor;
        while (temp<=dividend){
            result++;
            temp+=divisor;
        }
        return result;
    }
    public static int calMinus(int dividend, int divisor){
        int result=0;
        int temp=divisor;
        while (temp>=dividend){
            result++;
            temp+=divisor;
        }
        return result;
    }*/

    // 二分查找算法
    public static int divide(int dividend, int divisor){
        if (divisor==-1){
            if(dividend== Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        boolean signB = (dividend > 0) ^ (divisor > 0);
        int result = 0;
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        while (dividend<=divisor){

            int temp=divisor;
            int c=1;
            while (dividend-temp<=temp){
                temp =temp<<1;
                c=c<<1;
            }
            dividend-=temp;
            result+=c;
        }
        return  signB?result:-result;
    }
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));

        System.out.println(0-(-2147483648));
    }
}
