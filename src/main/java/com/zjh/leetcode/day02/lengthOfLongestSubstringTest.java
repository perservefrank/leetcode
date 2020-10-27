package com.zjh.leetcode.day02;

/**
 * @author: jinheng.zhao
 * @create: 2020-08-21
 **/
public class lengthOfLongestSubstringTest {



    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }


    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int maxLenth=0;
        String maxStr = "";
        for (int i=0,length=chars.length;i<length;i++){
            if(maxStr.indexOf(String.valueOf(chars[i]))>=0){
                maxStr =  maxStr.substring(maxStr.indexOf(String.valueOf(chars[i]))+1,maxStr.length())+String.valueOf(chars[i]);
            }else {
                maxStr = maxStr+String.valueOf(chars[i]);
                if (maxLenth<maxStr.length()){
                    maxLenth = maxStr.length();
                }
            }
        }
        return maxLenth;
    }
}
