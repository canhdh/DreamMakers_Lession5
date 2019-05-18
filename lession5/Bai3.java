import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int Y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam: ");
        Y = sc.nextInt();
        if(Y%400 == 0 || (Y%4 == 0 && Y%100 != 0))
            System.out.println("La nam nhuan: 366 Ngay");
        else
            System.out.println("Ko la nam nhuan: 365 ngay");
    }
}
