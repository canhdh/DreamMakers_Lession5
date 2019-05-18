package method;

import java.util.Scanner;

public class Type_Of_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        do {
            System.out.println("Nhập 3 cạnh của tam giác a, b, c:");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            if (a + b <= c || a + c <= b || b + c <= a)
                System.out.println("3 cạnh không hợp lệ! Mời nhập lại!");
        } while (a + b <= c || a + c <= b || b + c <= a);
        if (a == b && b == c) System.out.println("Tam giác đều");
        else if ((a == b && a != c) || (b == c && b != a) || (a == c && c != b)) {
            if ((a == b && a != c && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
                    || (b == c && b != a && Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
                    || (a == c && c != b && Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)))
                System.out.println("Tam giác vuông cân");
            else System.out.println("Tam giác cân");
        } else System.out.println("Tam giác thường");

    }
}
