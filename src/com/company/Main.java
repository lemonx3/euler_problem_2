package com.company;

public class Main {

    public static void main(String[] args) {
        int p = 0;
        int sum = 0;
        while(fib(p) <= 4000000) {
            //System.out.println(fib(p++));
            if (fib(p)%2!=0) {
                sum += fib(p);
            }
            p++;
        }
        System.out.println(sum);
    }

    private static final int fib(int x) {
        if((x==1) || (x==0)) {
            return x;
        }else {
            return ((fib(x-1)+fib(x-2)));
        }
    }

}
