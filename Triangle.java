package method;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.println("Nhập đọ dài của 3 đoạn thẳng a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if ((a + b > c) && (b + c > a) && (a + c > b)){
            double p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("3 đoạn thẳng có thể tạo thành 1 tam giác có diện tích S = " + S);
        }
        else{
            System.out.println("3 đoạn thẳng không thể tạo thành một tam giác");
        }
    }
}
