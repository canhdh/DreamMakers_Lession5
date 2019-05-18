package com.k001.basic;
import java.util.Scanner;
public class bai1 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        double a,b;
        a = cin.nextDouble();
        b = cin.nextDouble();
        if (a == 0 && b == 0) System.out.println("Phương trình có vô số nghiệm");
        else if (a == 0 && b > 0) System.out.println("Phương trình vô nghiệm");
        else System.out.println("Phương trình có nghiệm là: " + (b/a));
    }
}
