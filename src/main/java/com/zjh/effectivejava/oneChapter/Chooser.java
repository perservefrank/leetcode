package com.zjh.effectivejava.oneChapter;

import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author: jinheng.zhao
 * @create: 2020-11-18
 **/
public class Chooser<T> {
    private final T[] choiceArray;

    public Chooser(Collection<T> collection){
        choiceArray = (T[])collection.toArray();
    }

    public Object choose(){
        ThreadLocalRandom current = ThreadLocalRandom.current();
        return choiceArray[current.nextInt(choiceArray.length)];
    }


}
