package com.gradlic.java8.stream;

import java.util.stream.IntStream;

public class IntStreamEx {
    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println();
    }
}
