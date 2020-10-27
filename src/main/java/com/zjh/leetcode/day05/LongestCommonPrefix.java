package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-10
 **/
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length<=0){
            return "";
        }
        String result=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(result)){
                result=result.substring(0,result.length()-1);
            }
        }
        return result;
    }

/*
   solution two:
   public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if (i==0){
                result=strs[i];
                min = Math.min(min,result.length());
            } else {
                int min1 = Math.min(result.length(),strs[i].length());
                String temp="";
                for(int j=0;j<min1;j++){
                    String sub1 = result.substring(j, j + 1);
                    String sub2 = strs[i].substring(j, j + 1);
                    if (!sub1.equals(sub2)){
                        break;
                    }else {
                        temp=temp+sub1;
                    }
                }
                result=temp;
            }
        }
        return result;
    }*/

 /*

 public static String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        if (strs.length<=0){
            return sb.toString();
        }

        int minLength= Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if (minLength>strs[i].length()){
                minLength=strs[i].length();
            }
        }

        for(int i=0;i<minLength;i++){
            String temp="";
            boolean flag=true;
            for(int j=0;j<strs.length;j++){
                String substring = strs[j].substring(i, i + 1);
                if (j==0){
                    temp=substring;
                }else if (!temp.equals(substring)){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }

            sb.append(temp);
        }
        return sb.toString();
    }*/

    public static void main(String[] args) {
        String [] strs= {"c","acc","ccc"};
        System.out.printf(longestCommonPrefix(strs));
    }
}
