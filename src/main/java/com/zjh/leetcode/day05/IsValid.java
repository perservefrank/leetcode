package com.zjh.leetcode.day05;

import java.util.*;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-21
 **/
public class IsValid {
    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        for(Character c:chars){
            if (c == '('){
                list.add(')');
            }else if (c == '['){
                list.add(']');
            }else if (c == '{'){
                list.add('}');
            }else if(list.isEmpty() || !c.equals(list.removeLast())){
               return false;
            }
        }

        return list.isEmpty();
    }

/*    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('(', Arrays.asList('(',')'));
        map.put('{', Arrays.asList('{','}'));
        map.put('[', Arrays.asList('[',']'));

        List<Character> list = new ArrayList<>();
        for(Character c:chars){
            if (list.size()==0){
                list.add(c);
            } else {
                Character character = list.get(list.size() - 1);
                List<Character> characters = map.get(character);
                if (characters!= null && characters.get(1).equals(c)){
                    list.remove(list.size()-1);
                }else {
                    list.add(c);
                }
            }
        }
        if (list.size() ==0){
            return true;
        }
        return false;
    }*/

    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
}
