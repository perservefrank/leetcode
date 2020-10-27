package com.zjh.leetcode.day04;

/**
 * @author: jinheng.zhao
 * @create: 2020-08-28
 **/
public class MyAtoi {
    public static int myAtoi(String str) {
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        int b=0,c=0;
        for (int i=0,length= chars.length;i<length;i++){
            if(chars[i] == ' ' && (b==0 && c==0)){
                continue;
            }else if(Character.isDigit(chars[i])){
                b++;
                sb.append(String.valueOf(chars[i]));
            }else if (b==0 &&c==0 && (chars[i] == '-' || chars[i] =='+')){
                c++;
                sb.append(String.valueOf(chars[i]));
            }else {
                break;
            }
        }
        String s = sb.toString();
        if (s.equals("") || "-".equals(s) || "+".equals(s)){
            return 0;
        }
        String value = sb.toString();
        if (value.startsWith("-")){
            Long aLong = 0L;
            try {
                aLong = Long.valueOf(value);
            } catch (NumberFormatException e) {
                return Integer.MIN_VALUE;
            }
            if (aLong<=Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            return  aLong.intValue();
        }else {
            Long aLong = 0L;
            try {
                aLong = Long.valueOf(value);
            } catch (NumberFormatException e) {
                return Integer.MAX_VALUE;
            }
            if (aLong>=Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            return aLong.intValue();
        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(myAtoi("0-1"));
    }
}
