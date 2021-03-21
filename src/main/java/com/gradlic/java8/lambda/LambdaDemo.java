package com.gradlic.java8.lambda;

interface A{
    void show();
}

// Implementation using another class
class Xyz implements A{

    @Override
    public void show() {
        System.out.println("Hello");
    }
}

public class LambdaDemo {
    public static void main(String[] args) {

        // Object call
        A obj1 = new Xyz();
        obj1.show();

        A obj;

        // Implementation using anonymous class
        obj = new A() {
            @Override
            public void show() {
                System.out.println("Hello");
            }
        };

        obj.show();

        // Implementation using lambda
        A obj3 = ()-> System.out.println("Hello");
        obj3.show();
    }
}
