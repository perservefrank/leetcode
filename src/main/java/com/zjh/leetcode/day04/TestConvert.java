package com.zjh.leetcode.day04;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jinheng.zhao
 * @create: 2020-08-26
 **/
public class TestConvert {

    public static String convert(String s,int numRows){
        if (s.length()<=numRows || numRows==1){
            return s;
        }
        char[] chars = s.toCharArray();

        String [] arr= new String[numRows];
        int a = 0;
        int b = 0;
        int c = 1;
        for(int i=0,length=chars.length; i<length;i++){
            arr[b]=arr[b].trim()+String.valueOf(chars[i]).trim();
            if (b==numRows-1 || b==0&&a!=0){
                c++;
            }
            int d = c%2;
            if (d>0){
                b++;
            } else {
                b--;
                a++;
            }
        }
        String result="";
        for(String s1:arr){
            result =result+s1;
        }
        return result;
    }

  /*
  方法二：
  public static String convert(String s, int numRows) {
        if (s.length()<=numRows || numRows==1){
            return s;
        }
        char[] chars = s.toCharArray();

        Map<Integer, String> map = new HashMap<>();
        int a = 0;
        int b = 0;
        int c = 1;
        for(int i=0,length=chars.length; i<length;i++){
            String s1 = map.get(b);
            if (s1 == null || "".equals(s1)){
                map.put(b,String.valueOf(chars[i]).toLowerCase());
            }else {
                map.put(b,map.get(b)+String.valueOf(chars[i]).toLowerCase());
            }
            if (b==numRows-1 || b==0&&a!=0){
                c++;
            }
            int d = c%2;
            if (d>0){
                b++;
            } else {
                b--;
                a++;
            }
        }
        String result="";
        for (Map.Entry<Integer, String> key: map.entrySet()) {
            result= result+ key.getValue();
        }
        return result;
    }*/

    /* 
    public static String convert(String s, int numRows) {
        if (s.length()<=numRows || numRows==1){
            return s;
        }

        char[] chars = s.toCharArray();
        int pageSize = s.length()/2+1;
        char [][] arr = new char [pageSize][numRows];
        int a = 0;
        int b = 0;
        int c = 1;
        for(int i=0,length=chars.length; i<length;i++){
            System.out.println(a+"---"+b);
            arr[a][b]=chars[i];
            if (b==numRows-1 || b==0&&a!=0){
                c++;
            }
            int d = c%2;
            if (d>0){
                b++;
            } else {
                b--;
                a++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<numRows;i++){
            for(int j=0;j<pageSize;j++){
                stringBuilder.append(String.valueOf(arr[j][i]).trim());
            }
        }
        return stringBuilder.toString();
    }*/

    public static void main(String[] args) {
        if ("LCIRETOESIIGEDHN".equals(convert("LEETCODEISHIRING",3))){
            System.out.println("true");
        }
    }
}
