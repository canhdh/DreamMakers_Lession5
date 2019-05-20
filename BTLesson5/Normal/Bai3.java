package com.k001.basic;

import javax.sql.rowset.spi.SyncProvider;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int year;
        Scanner cin = new Scanner(System.in);
        year = cin.nextInt();
        if ((year % 4 ==0 && year % 100 != 0) || (year % 400 == 0)) System.out.println("Năm " + year + " có 366 ngày");
        else System.out.println("Năm " + year + " có 365 ngày");
    }
}
