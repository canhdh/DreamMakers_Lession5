package method;

import java.util.Scanner;

public class Check_Point_In_Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, distance;

        System.out.println("Nhập tọa độ điểm M(x,y)");
        System.out.print("x = "); x = scanner.nextDouble();
        System.out.print("y = "); y = scanner.nextDouble();


        distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        if (distance <= 1.0) System.out.println("Điểm M thuộc hình tròn tâm O bán kính 1");
        else System.out.println("Điểm M không thuộc hình tròn tâm O bán kính 1");
    }
}
