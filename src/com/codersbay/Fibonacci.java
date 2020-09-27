package com.codersbay;

public class Fibonacci {

    public static int fib(int number) {
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else
            return fib(number - 1) + fib(number - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));

    }

}
