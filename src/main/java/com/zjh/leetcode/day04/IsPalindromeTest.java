package com.zjh.leetcode.day04;

/**
 * @author: jinheng.zhao
 * @create: 2020-08-28
 **/
public class IsPalindromeTest {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int y=x;
        int sum=0;
        while (y>0){
            sum=sum*10+y%10;
            y = y/10;
        }
        if (x==sum){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {

    }
}
