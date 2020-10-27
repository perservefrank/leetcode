package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-10-15
 **/
public class CountAndSayTest {
   /* public static String countAndSay(int n) {
        String result="1";
        if (n==1){
            return result;
        }
        StringBuffer sb =null;
        for(int i=2;i<=n;i++){
            sb= new StringBuffer();
            char[] chars = result.toCharArray();
            int index=0;
            char temp=chars[chars.length-1];
            for(int j=chars.length-1;j>=0;j--){
                if (chars[j]==temp){
                    index++;
                }else {
                    sb.insert(0,index+String.valueOf(temp));
                    index=1;
                    temp=chars[j];
                }
            }
            if (index>0){
                sb.insert(0,index+String.valueOf(temp));
            }

            result=sb.toString();
        }
        return result;
    }*/

     public static String countAndSay(int n) {
        String result="1";

        return result;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(10));
    }
}
