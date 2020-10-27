package com.zjh.leetcode.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-18
 **/
public class LetterCombinations {
    /**
    * 2
    * 3
    * 4
    * 5
    * 6
    * 7
    * 8
    * 9
    **/

    public static List<String> letterCombinations(String digits) {
        List<String> result= new ArrayList<>();
        if ("".equals(digits)){
            return result;
        }
        char[] chars = digits.toCharArray();
        List<List<String>> codeLists = Arrays.asList(Arrays.asList("a","b","c"), Arrays.asList("d","e","f"), Arrays.asList("g","h","i"), Arrays.asList("j","k","l"), Arrays.asList("m","n","o"),
                Arrays.asList("p","q","r","s"), Arrays.asList("t","u","v"), Arrays.asList("w","x","y","z"));

        result = codeLists.get(Integer.valueOf(digits.substring(0,1))-2);
        for(int i=1;i<chars.length;i++){
            Integer index = Integer.valueOf(String.valueOf(chars[i]))-2;
            List<String> codes = codeLists.get(index);
            List<String> temp= new ArrayList<>();
            for(int j=0;j<result.size();j++){
                for(int z=0;z<codes.size();z++){
                    temp.add(result.get(j)+codes.get(z));
                }
            }
            result=temp;
        }
        return result;
    }

    /*public static List<String> letterCombinations(String digits) {
        List<String> result= new ArrayList<>();
        if ("".equals(digits)){
            return result;
        }
        char[] chars = digits.toCharArray();
        List<List<String>> codeLists = Arrays.asList(Arrays.asList("a","b","c"), Arrays.asList("d","e","f"), Arrays.asList("g","h","i"), Arrays.asList("j","k","l"), Arrays.asList("m","n","o"),
                Arrays.asList("p","q","r","s"), Arrays.asList("t","u","v"), Arrays.asList("w","x","y","z"));
        for(int i=0;i<chars.length;i++){
            Integer index = Integer.valueOf(String.valueOf(chars[i]))-2;
            List<String> codes = codeLists.get(index);
            if(result.size()<=0){
                for(int j=0;j<codes.size();j++){
                    result.add(codes.get(j));
                }
            }else{
                List<String> temp= new ArrayList<>();
                for(int j=0;j<result.size();j++){
                    for(int z=0;z<codes.size();z++){
                        temp.add(result.get(j)+codes.get(z));
                    }
                }
                result=temp;
            }
        }
        return result;
    }
*/
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
