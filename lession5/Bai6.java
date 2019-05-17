import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        double xA, yA, xB, yB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do diem A: ");
        xA = sc.nextDouble();
        yA = sc.nextDouble();
        System.out.println("Nhap toa do diem B: ");
        xB = sc.nextDouble();
        yB = sc.nextDouble();
        double ans = Math.sqrt(Math.pow((xB-xA), 2) + Math.pow((yB-yA), 2));
        System.out.println("Khoang cach giua 2 diem: " + ans);
    }
}
