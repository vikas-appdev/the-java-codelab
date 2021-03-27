package com.gradlic.java8.stream.reduction;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReductionDemo {
    public static void main(String[] args) {
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a+b);

        System.out.println(total);

        // Reduction - summary statistic
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
        System.out.println(summary);

    }
}
