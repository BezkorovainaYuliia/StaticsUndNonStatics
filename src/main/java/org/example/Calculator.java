package org.example;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(Calculator.add(1,2));
        System.out.println(Calculator.sub(5,3));
        System.out.println(Calculator.mul(3,4) );
        System.out.println(Calculator.div(5,3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }
    public static double div(int a, int b) {
        return (double )a / b;
    }
}
