package com.k001.basic;

import java.util.Scanner;

public class Bai7 {
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double x,y;
        x = cin.nextDouble();
        y = cin.nextDouble();
        if (distance(0,0,1,1) >= distance(0,0,x,y)) System.out.println("Yes");
        else System.out.println("No");
    }
}
