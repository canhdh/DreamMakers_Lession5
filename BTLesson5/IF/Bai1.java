package com.k001.basic;

import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a,b;
        char op;
        a = cin.nextInt();
        b = cin.nextInt();
        op = cin.nextLine().charAt(1);
        if (op == '+') System.out.println(a + " " + op + " " + b + " = " + (a + b));
        else if (op == '-') System.out.println(a + " " + op + " " + b + " = " + (a - b));
        else if (op == '*') System.out.println(a + " " + op + " " + b + " = " + (a * b));
        else System.out.println(a + " " + op + " " + b + " = " + (a / b));
    }
}
