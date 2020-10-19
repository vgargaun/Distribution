package com.distributia;

import java.util.Scanner;

public class ModelulDistributia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input N: ");
        long n = input.nextInt();
        System.out.print("\nInput m: ");
        long m = input.nextInt();

        System.out.println("\nDistributie P("+n+","+m+") = "+DistributieIplm.distributie(n,m));

    }
}
