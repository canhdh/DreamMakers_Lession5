package method;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.println("Giải phương trình bậc 2: a.x^2 + b.x + c = 0");
        System.out.print("Nhập a = ");
        a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        b = scanner.nextDouble();
        System.out.print("Nhập c = ");
        c = scanner.nextDouble();
        delta = Math.pow(b,2) - 4 * a * c;
        if (delta < 0) System.out.println("Phương trình " + a + "x^2 + " + b + "x + " + c + " = 0 vô nghiệm");
        if (delta == 0){
            x1 = -b / (2 * a);
            System.out.println("Phương trình " + a + "x^2 + " + b + "x + " + c + " = 0 có nghiệm kép x = " + x1);
        }
        if (delta > 0){
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình " + a + "x^2 + " + b + "x + " + c +" = 0 có 2 nghiệm phân biệt x1 = " + x1 + " và x2 = " + x2);
        }
    }
}
