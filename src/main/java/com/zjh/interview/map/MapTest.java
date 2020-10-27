package com.zjh.interview.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jinheng.zhao
 * @create: 2020-08-28
 **/
public class MapTest {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        for(int i=0;i<100;i++){
            map.put(""+i,i);
        }

  /*      int a=10;
        int b=8;
        System.out.println(a%b);

        System.out.println(a&(b-1));*/
    }
}
