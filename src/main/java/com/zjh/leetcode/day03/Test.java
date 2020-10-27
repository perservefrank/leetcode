package com.zjh.leetcode.day03;

/**
 * @author: jinheng.zhao
 * @create: 2020-08-25
 **/
public class Test {
    /**
    * @Param [A, m]
    * @return int
    **/
    public static int test(int []A, int m){
        int[] f = new int[m + 1];
        f[0] = 0;
        for(int i =1;i<=m;i++){
            f[i] = -1;
            for(int j=0,length=A.length;j<length;j++){
                if (i>=A[j] && f[i-A[j]]!=-1){
                    f[i]=Math.min(f[i-A[j]]+1,f[i]);
                }
            }
        }

        return f[m];
    }


    public static void main(String[] args) {
        int [] A={2,5,7};
        System.out.println( test(A,27));
    }
}
