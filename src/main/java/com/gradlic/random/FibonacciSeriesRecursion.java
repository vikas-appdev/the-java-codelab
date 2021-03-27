package com.gradlic.random;

public class FibonacciSeriesRecursion {
    static int a=0, b=1, c;
    public static void main(String[] args) {
        System.out.print(a+ " "+b);
        FibonacciSeriesRecursion recursion = new FibonacciSeriesRecursion();
        recursion.fiboPrint(10);
    }

    void fiboPrint(int i){
        if (i>=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            fiboPrint(i-1);
        }
    }
}
