package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-10-12
 **/
public class StrStrTest {
    public static int strStr(String haystack, String needle) {
        if (haystack.equals(needle)){
            return 0;
        }
        int index=-1;
        int start=0;
        int interval = needle.length();

        while ((start+interval)<=haystack.length()){
            int legnth = start + interval;
            String substring = haystack.substring(start, legnth);
            String hayFirst = haystack.substring(start, start + 1);
            String needleFirst = needle.substring(0, 1);
            if (hayFirst.equals(needleFirst) && substring.equals(needle)){
                index=start;
                break;
            }
            start++;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(strStr("abc","c"));
    }
}
