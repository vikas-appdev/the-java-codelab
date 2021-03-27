package com.gradlic.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OtherStreamDemo {
    public static void main(String[] args) {
        // Stream.of sorted and find first
        Stream.of("Vikas", "Suraj", "Supriya")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // Stream from array, sort, filter and print
        String[] names = {"Vikas", "Suraj", "Supriya", "Suneeta", "Harendra", "Arunav", "Aranab", "Rohan", "Badal"};
        Arrays.stream(names) // smae as Stream.of(names)
                .filter(x->x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

        // Average of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        // Stream from list filter and print
        List<String> peoples = Arrays.asList("Vikas", "Suraj", "Supriya", "Suneeta", "Harendra", "Arunav", "Aranab", "Rohan", "Badal");
        peoples.stream().map(String::toLowerCase)
                .filter(x->x.startsWith("h")).forEach(System.out::println);





    }
}
