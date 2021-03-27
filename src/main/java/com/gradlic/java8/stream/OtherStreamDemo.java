package com.gradlic.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OtherStreamDemo {
    public static void main(String[] args) throws IOException {
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


        // Stream rows from text file, sort, filter and print
        Stream<String> bands = Files.lines(Paths.get("names.txt"));
        bands.sorted()
                .filter(x-> x.length() > 3)
                .forEach(System.out::println);

        bands.close();

        List<String> bands2 = Files.lines(Paths.get("names.txt"))
                .filter(x->x.contains("df"))
                .collect(Collectors.toList());
        bands2.forEach(x-> System.out.println(x));

        // stream rows from csv file
        Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
        int rowCount = (int)rows1.map(x->x.split(",")).filter(x->x.length==3).count();
        System.out.println(rowCount+"rows");
        rows1.close();



        Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
        rows2.map(x->x.split(","))
                .filter(x -> x.length == 3)
                .filter(x-> Integer.parseInt(x[1])>15)
                .forEach(x-> System.out.println(x[0]+" "+x[1]+" "+x[2]));

        rows2.close();


        Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3.map(x->x.split(","))
                .filter(x-> x.length == 3)
                .filter(x-> Integer.parseInt(x[1])> 15)
                .collect(Collectors.toMap(
                        x->x[0],
                        x->Integer.parseInt(x[1])
                ));
        rows3.close();

        for (String key: map.keySet()){
            System.out.println(key+ " "+map.get(key));
        }




    }
}
