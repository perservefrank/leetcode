package com.zjh.effectivejava.oneChapter;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Stack;

/**
 * @author: jinheng.zhao
 * @create: 2020-11-17
 **/
public class PizzTest {
    public static void main(String[] args) throws IOException {
        Piazz piazz = new NyPizza.Builder(NyPizza.Size.LARGE).addTopping(Piazz.Topping.MUSHROOM).build();
        System.out.printf(piazz.toString());
        Stack<Object> objects = new Stack<>();
        objects.push("aaa");
        System.out.println(objects.pop());

        Person person = new Person();
        System.out.println(person.equals(new Person()));
    }
}
