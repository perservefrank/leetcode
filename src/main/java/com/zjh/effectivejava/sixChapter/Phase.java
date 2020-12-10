package com.zjh.effectivejava.sixChapter;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

/**
 * @author: jinheng.zhao
 * @create: 2020-11-20
 **/
public enum Phase {
    SOLID, LIQUID, GAS;

    public enum Transition{
        MELT(SOLID,LIQUID), FREEZE(LIQUID, SOLID),
        BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);
        private final Phase from;
        private final Phase to;

        Transition(Phase from, Phase to) {
            this.from = from;
            this.to = to;
        }

        private static final Map<Phase, Map<Phase, Transition>> m =
                Stream.of(values()).collect(groupingBy(t ->t.from,()-> new EnumMap<>(Phase.class),
                        Collectors.toMap(t->t.to, t->t,(x, y)->y,()->new EnumMap<>(Phase.class))));

        public static Transition from(Phase from, Phase to){
            return m.get(from).get(to);
        }
    }

}
