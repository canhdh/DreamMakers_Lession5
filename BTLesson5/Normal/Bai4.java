package com.k001.basic;

import java.util.Scanner;

public class Bai4 {
    public static int Max;
    public static int Min;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            int x;
            x = cin.nextInt();
            if (i == 1) {
                Max = Min = x;
            } else {
                Max = Math.max(Max, x);
                Min = Math.min(Min, x);
            }
        }
        System.out.println("Max: " + Max);
        System.out.println("Min: " + Min);
    }
}
