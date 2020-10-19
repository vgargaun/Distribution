package com.distributia;

public class DistributieIplm {
    public static long distributie(long n, long m) {

        long factorial = 1;
        for (int i = 1; i < m; i++)
            factorial = factorial * i;

        long pi = 1;
        for (int i = 1; i < m; i++)
            pi = pi * (n + i);

        return pi / factorial;
    }
}
