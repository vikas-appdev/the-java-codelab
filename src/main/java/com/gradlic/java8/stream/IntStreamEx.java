package com.gradlic.java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamEx {
    public static void main(String[] args) {

        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println();

        // Integer stream with skip
        IntStream.range(1, 10).skip(5).forEach(x-> System.out.println(x));
        System.out.print("-------------------");

        System.out.print("--------Intstream with sum-----------");
        System.out.println(IntStream.range(1,5).sum());
        System.out.println();


    }
}
