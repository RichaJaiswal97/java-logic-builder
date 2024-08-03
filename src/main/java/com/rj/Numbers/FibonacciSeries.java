package com.rj.Numbers;

public class FibonacciSeries {

    public static void main(String[] args) {
        int num = 9;
        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int num) {
        int n1 = 1;
        int n2 = 2;
        int n3;

        System.out.print(n1 + ", " + n2);
        for (int i = 2; i < num; i++) {
            n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
