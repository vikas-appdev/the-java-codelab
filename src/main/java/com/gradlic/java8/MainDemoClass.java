package com.gradlic.java8;

import com.sun.tools.javac.Main;

public class MainDemoClass implements InterfaceDefaultAndStatic {
    public static void main(String[] args) {
        System.out.println(InterfaceDefaultAndStatic.helloStatic());


        MainDemoClass mainDemoClass = new MainDemoClass();
        mainDemoClass.abstractMethod();

        System.out.println(mainDemoClass.helloDefault());

    }

    @Override
    public void abstractMethod() {
        System.out.println("Implementation for the SAM");
    }
}
