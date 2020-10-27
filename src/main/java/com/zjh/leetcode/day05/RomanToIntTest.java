package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-08
 **/
public class RomanToIntTest {
    static String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static int[] arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<roman.length;i++){
            String str = roman[i];
            while (s.indexOf(str)==0){
                s = s.substring(str.length(),s.length());
                sum+=arab[i];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("MMMMMCMCMIII"));
    }

   /*
   ·½·¨Ò»£º
    public static int romanToInst(String s) {
        int sum=0;
        int index =0;
        while (s.length()>0){
            if (s.length()<2){
                String substring = s.substring(0, 1);
                for(int i=index;i<roman.length;i++){
                    if (roman[i].equals(substring)){
                        sum+= arab[i];
                        index=i;
                        s = s.substring(1,s.length());
                        break;
                    }
                }
            }else{
                String substring = s.substring(0, 2);
                boolean flag= false;
                for(int i=index;i<roman.length;i++){
                    if (roman[i].equals(substring)){
                        sum+= arab[i];
                        index=i;
                        flag=true;
                        s = s.substring(2,s.length());
                        break;
                    }
                }
                if (!flag){
                    String sub = s.substring(0, 1);
                    for(int i=index;i<roman.length;i++){
                        if (roman[i].equals(sub)){
                            sum+= arab[i];
                            index=i;
                            s = s.substring(1,s.length());
                            break;
                        }
                    }
                }
            }
        }
        return sum;
    }*/



}
