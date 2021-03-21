package com.gradlic.java8;

import java.util.Arrays;
import java.util.List;

public class InternalAndForEachLoop {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // Normal for loop
        for(int i=0; i<values.size(); i++){
            System.out.println(values.get(i));
        }

        // For each
        for (int i: values){
            System.out.println(i);
        }

        // Internal loops
        values.forEach(i-> System.out.println(i)); // lambda expression


    }
}
