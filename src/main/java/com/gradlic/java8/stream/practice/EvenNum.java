package com.gradlic.java8.stream.practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EvenNum {
    public static void main(String[] args) {
        Stream.iterate(1, integer -> integer+1)
                .filter(integer -> integer%2 == 0)
                .limit(10)
                .forEach(System.out::println);

        IntStream.range(1, 21)
                .filter(value -> value%2==0)
                .forEach(System.out::println);


    }
}
