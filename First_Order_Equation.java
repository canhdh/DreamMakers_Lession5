package method;

import java.util.Scanner;

public class First_Order_Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, x;
        System.out.println("Giải phương trình bậc nhất ax + b = 0");
        System.out.print("Nhập a = ");
        a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        b = scanner.nextDouble();
        if (a == 0 && b != 0) System.out.println("Phương trình vô nghiệm");
        if (a == 0 && b == 0) System.out.println("Phương trình vô số nghiệm");
        if (a != 0) {
            x = -b / a;
            System.out.println("Nghiệm của phương trình x = " + x);
        }
    }
}
