package com.k001.basic;
import java.util.Scanner;
import java.lang.Math;
public class Bai2 {
    public static void main(String args[]){
        double a,b,c;
        Scanner cin = new Scanner(System.in);
        a = cin.nextDouble();
        b = cin.nextDouble();
        c = cin.nextDouble();
        if (a == 0) {
            if (b == 0 && c == 0) System.out.println("Phương trình có vô số nghiệm");
            else if (b == 0 && c != 0) System.out.println("Phương trình vô nghiệm");
            else  System.out.println("Phương trình có 1 nghiệm: x = " + (c/b));
        } else {
            double del = b*b - 4*a*c;
            if (del < 0) System.out.println("Phương trình vô nghiệm");
            else if(del == 0) System.out.println("Phương trình có nghiệm kép: x = " + (-b/(2*a)));
            else {
                double x1 = (-b - Math.sqrt(del))/(2 * a);
                double x2 = (-b + Math.sqrt(del))/(2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

    }
}
