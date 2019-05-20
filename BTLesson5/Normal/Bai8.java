package com.k001.basic;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Character x;
        x = cin.nextLine().charAt(0);
        if (Character.isLetter(x)) System.out.println(x + " là chữ cái");
        else if (Character.isDigit(x)) System.out.println(x + " là chữ số");
        else System.out.println(x + " là ký tự khác");
    }
}
