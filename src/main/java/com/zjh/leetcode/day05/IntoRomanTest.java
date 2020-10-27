package com.zjh.leetcode.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-02
 **/
public class IntoRomanTest {
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        List<List<String>> list= new ArrayList<>();
        list.add(Arrays.asList("I","V"));
        list.add(Arrays.asList("X","L"));
        list.add(Arrays.asList("C","D"));
        list.add(Arrays.asList("M",null));
        int i=0;
        List<String> temp= null;
        while(num>0 && (temp =list.get(i))!=null){
            int value = num%10;
            if (temp.get(1)!=null){
                if (value<4){
                    for(int j=0;j<value;j++){
                        sb.append(temp.get(0));
                    }
                }else if (value %4==0){
                    sb.append(temp.get(1)).append(temp.get(0));
                }else if (value %5==0){
                    sb.append(temp.get(1));
                }else if (value>5 && value<9){
                    int va = value - 5;
                    for(int j=0;j<va;j++){
                        sb.append(temp.get(0));
                    }
                    sb.append(temp.get(1));
                }else {
                    List<String> strings = list.get(i + 1);
                    sb.append(strings.get(0)).append(temp.get(0));
                }
            }else {
                for(int j=0;j<value;j++){
                    sb.append(temp.get(0));
                }
            }

            num = num/10;
            i++;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        //  "MCMXCIV"
        System.out.println(intToRoman(1994));
    }
}
