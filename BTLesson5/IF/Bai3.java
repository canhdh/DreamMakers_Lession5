package com.k001.basic;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int fee = 0;
        fee = fee + 550 * Math.min(50,n);
        n = Math.max(n - 50,0);
        fee = fee + 850 * Math.min(50,n);
        n = Math.max(n - 50,0);
        fee = fee + 1200 * Math.min(100,n);
        n = Math.max(n - 100,0);
        fee = fee + 1500 * Math.min(50,n);
        System.out.println("Thành tiền: "+ fee);
    }
}

