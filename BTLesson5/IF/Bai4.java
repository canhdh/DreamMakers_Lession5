package com.k001.basic;

import java.util.Scanner;

public class Bai4 {
    public static boolean check(double a,double b,double c){
        if (a*a + b*b == c*c) return  true;
        if (a*a + c*c == b*b) return  true;
        if (c*c + b*b == a*a) return  true;
        return  false;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double a,b,c;
        a = cin.nextDouble();
        b = cin.nextDouble();
        c = cin.nextDouble();
        if (a == b && b == c) {
            System.out.println("Tam giác đã cho là tam giác đều");
        } else if (a == b || a == c || b == c){
            if (check(a,b,c)) System.out.println("Tam giác đã cho là tam giác vuông cân");
            else System.out.println("Tam giác đã cho là tam giác cân");
        } else if (check(a,b,c)) System.out.println("Tam giác đã cho là tam giác vuông");
        else System.out.println("Tam giác đã cho là tam giác thường");
    }
}
