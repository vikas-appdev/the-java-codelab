package com.gradlic.java8.stream.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {
    public static List<Person> createPeople(){
        return Arrays.asList(
                new Person("Vikas", Gender.MALE, 27),
                new Person("Vikas", Gender.MALE, 12),
                new Person("Supriya", Gender.FEMALE, 11),
                new Person("Supriya", Gender.FEMALE, 25),
                new Person("Suraj", Gender.MALE, 14),
                new Person("Suraj", Gender.MALE, 25)

        );
    }

    public static void main(String[] args) {
        List<Person> people = createPeople();

        // name of all female older than 18 get in uppercase
        List<String> names = new ArrayList<>();
        for (Person person: people){
            if (person.getAge() > 18){
                names.add(person.getName().toUpperCase());
            }
        }
        System.out.println(names);

        // lambda
        people.stream()
                .filter(p-> p.getAge()>18)
                .forEach(person -> System.out.println(person.getName().toUpperCase()));

        // or
        List<String> names2 = people.stream()
                .filter(person -> person.getAge() > 18)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(names2);


        //
        people.stream()
                .filter(person -> person.getGender() == Gender.MALE)
                .forEach(System.out::println);

        // reduce
        System.out.println(people.stream()
                .map(Person::getAge)
                .reduce(0, (carry, age)-> carry+age));

        System.out.println(people.stream()
                .map(Person::getAge)
                .reduce(Integer::sum));

        System.out.println(people.stream().mapToInt(Person::getAge).sum());


        System.out.println(people.stream().max((o1, o2) -> o1.getAge() > o2.getAge() ? 1 : -1));

        System.out.println(people.stream().filter(person -> person.getAge() < 18).count());

        Map<String, Person> map = people.stream()
                .collect(Collectors.toMap(
                        person -> person.getName()+":"+person.getAge(),
                        person -> person));
        System.out.println(map);


        Map<String, List<Person>> map2 = people.stream()
                .collect(Collectors.groupingBy(Person::getName));
        System.out.println(map2);

        map2.forEach((key, value) -> System.out.println(key+" :"+value));

    }
}
