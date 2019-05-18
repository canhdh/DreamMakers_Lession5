package method;

import java.util.Scanner;

public class Distance_of_Two_Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, y1, x2, y2, distance;

        System.out.println("Nhập tọa độ của 2 điểm A(x1,y1) và B(x2,y2)");
        System.out.print("x1 = ");
        x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        y1 = scanner.nextDouble();
        System.out.print("x2 = ");
        x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        y2 = scanner.nextDouble();

        distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println("Khoảng cách giữa 2 điểm d = " + distance);
    }
}
