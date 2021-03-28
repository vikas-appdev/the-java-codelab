package com.gradlic.java8.stream.practice;

public class Person {
    private final String name;
    private final Gender gender;
    private final int age;

    public Person(String theName, Gender theGender, int theAge){
        name = theName;
        gender =theGender;
        age = theAge;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Gender getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

