package com.zjh.effectivejava.sixChapter;

/**
 * @author: jinheng.zhao
 * @create: 2020-11-20
 **/
public class PhaseTest {
    public static void main(String[] args) {
        Phase.Transition from = Phase.Transition.from(Phase.GAS, Phase.LIQUID);
        System.out.println(from);
    }
}
