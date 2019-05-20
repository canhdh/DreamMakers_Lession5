package com.k001.basic;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner cin  = new Scanner(System.in);
        int date = cin.nextInt();
        switch (date % 7){
            case 1:{
                System.out.println(date + " is Saturday");
                break;
            }
            case 2:{
                System.out.println(date + " is Sunday");
                break;
            }
            case 3:{
                System.out.println(date + " is Monday");
                break;
            }
            case 4:{
                System.out.println(date + " is Tuesday");
                break;
            }
            case 5:{
                System.out.println(date + " is Wednesday");
                break;
            }
            case 6:{
                System.out.println(date + " is Thursday");
                break;
            }
            case 0:{
                System.out.println(date+" is Friday");
                break;
            }
        }
    }
}
