package com.k001.basic;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double x1,y1,x2,y2,d;
        x1 = cin.nextDouble();
        y1 = cin.nextDouble();
        x2 = cin.nextDouble();
        y2 = cin.nextDouble();
        d = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
        System.out.println("Khoảng cách giữa 2 điểm là: "+ d);
    }
}

