package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-11-09
 **/
public class MultiplyTest {
    public static String multiply(String num1, String num2) {
        if (num1 == null || num2 == null || "".equals(num1) || "".equals(num2)){
            return null;
        }
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();

        int[] ints = new int[chars1.length + chars2.length];
        for(int c2=chars2.length-1;c2>=0;c2--) {
            Integer value2 = Integer.valueOf(String.valueOf(chars2[c2]));
            for(int c1=chars1.length-1;c1>=0;c1--) {
                Integer value1 = Integer.valueOf(String.valueOf(chars1[c1]));
                int i= value2 * value1 +ints[c1 + c2 + 1];
                ints[c1+c2+1]=i%10;
                ints[c1+c2]+=i/10;
            }
        }

        StringBuilder builder = new StringBuilder();
        int j=0;
        for(int i=0;i<ints.length;i++){
            if (j==0 && ints[i]==0){
                continue;
            }else {
                j++;
                builder.append(ints[i]);
            }
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        System.out.println(multiply("9","9"));
    }
}
