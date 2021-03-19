package com.gradlic.java8;

@FunctionalInterface
public interface InterfaceDefaultAndStatic {
    static String helloStatic(){
        return "Hello from static method of interface. I will not allow myself for overriding.";
    }

    default String helloDefault(){
        return "Hello from default method. I can be overridden by implementation class.";
    }

    public void abstractMethod();

    // We can not add multiple abstract method inside a functional interface.
    //public void abstractMethod2();
}
