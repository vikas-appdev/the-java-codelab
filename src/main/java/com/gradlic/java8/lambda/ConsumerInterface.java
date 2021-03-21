package com.gradlic.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

public class ConsumerInterface {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("-----External implementation-------");
        Consumer<Integer> c1 = new ConsumerImpl();
        values.forEach(c1);
        System.out.println("------Inner class---------");

        Consumer<Integer> c2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        values.forEach(c2);
        System.out.println("------Lambda1-------");

        Consumer<Integer> c3 = (i) -> System.out.println(i);
        values.forEach(c3);

        System.out.println("--------Lambda2-----------");
        values.forEach(i-> System.out.println(i));
    }
}
