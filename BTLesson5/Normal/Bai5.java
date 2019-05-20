package com.k001.basic;

import java.awt.image.SampleModel;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner cin = new Scanner(System.in);
        a = cin.nextDouble();
        b = cin.nextDouble();
        c = cin.nextDouble();
        if (a + b > c && a + c > b && b + c > a){
            double p = (a + b + c)/2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Diện tích tam giác: " + S);
        } else  System.out.println("Đây không phải tam giác");
    }
}
