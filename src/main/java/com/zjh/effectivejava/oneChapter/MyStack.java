package com.zjh.effectivejava.oneChapter;

import org.omg.CORBA.Object;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author: jinheng.zhao
 * @create: 2020-11-18
 **/
public class MyStack<E> {
    private E[] elements;
    private int size=0;
    private static final int DEFAULT_INITIAL_CAPACITY=16;
    public MyStack(){
        elements=(E[])new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(E e){
        ensureCapacity();
        elements[size++]=e;
    }
    public E pop(){
        if (size==0){
            throw new EmptyStackException();
        }
        E result=elements[--size];
        elements[size]=null;
        return result;
    }

    private void ensureCapacity(){
        if (elements.length==size){
            elements= Arrays.copyOf(elements,2*size+1);
        }
    }
}
