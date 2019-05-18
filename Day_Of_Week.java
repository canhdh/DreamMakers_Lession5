package method;

import java.util.Scanner;

public class Day_Of_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        do {
            System.out.print("Nhập ngày trong tháng 3:");
            day = scanner.nextInt();
            if (day <= 0 || day >= 31) System.out.println("Ngày không hợp lệ! Mời nhập lại!");
        }while (day <= 0 || day >= 31);
        day = (day % 7);
        switch (day) {
            case 0: {
                System.out.println("Thứ 6");
                break;
            }
            case 1: {
                System.out.println("Thứ 7");
                break;
            }
            case 2:{
                System.out.println("Chủ Nhật");
                break;
            }
            case 3:{
                System.out.println("Thứ 2");
                break;
            }
            case 4:{
                System.out.println("Thứ 3");
                break;
            }
            case 5:{
                System.out.println("Thứ 4");
                break;
            }
            case 6:{
                System.out.println("Thứ 5");
                break;
            }
        }
    }
}
