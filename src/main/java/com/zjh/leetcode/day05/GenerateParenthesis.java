package com.zjh.leetcode.day05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-25
 **/
public class GenerateParenthesis {

    public static List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList();
        StringBuilder builder = new StringBuilder();
        generateAll(list, builder,0,0,n);
        return list;
    }

    private static void generateAll(List<String> list, StringBuilder builder, int open, int close, int max) {
        if (builder.length() == 2*max){
            list.add(builder.toString());
            return ;
        }
        if (open < max){
            builder.append("(");
            generateAll(list, builder, open+1, close, max);
            builder.deleteCharAt(builder.length()-1);
        }
        if (close<open){
            builder.append(")");
            generateAll(list, builder, open, close+1, max);
            builder.deleteCharAt(builder.length()-1);
        }
    }


/*
    暴利算法
     public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        generateAll(new char[2*n],0,list);
        return list;
    }

    private static void generateAll(char[] chars, int i, List<String> list) {
        if (chars.length== i){
            if (valid(chars)){
                list.add(String.valueOf(chars));
                return;
            }
        }else {
            chars[i]='(';
            generateAll(chars, i+1, list);
            chars[i]=')';
            generateAll(chars, i+1, list);
        }
    }

    private static boolean valid(char[] chars) {
        int balance =0;
        for(int i=0;i<chars.length;i++){
            if (chars[i]=='('){
                ++balance;
            }else {
                --balance;
            }
            if (balance<0){
                return false;
            }
        }
        return balance==0;
    }
*/


    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
