import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        double x;
        System.out.println("Nhap so luong dien tieu thu hang thang:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        double ans = 0;
        if(x <= 50)
            ans = x * 550;
        if(x > 50 && x < 100)
            ans = 50 * 550 + (x - 100) * 850;
        if(x >=100 && x < 200)
            ans = 50 * 550 + 50 * 850 + (x - 100) * 1000;
        if(x >= 200)
            ans = 50 * 550 + 50 * 850 + 100 * 1000 + (x - 200) * 1500;
        System.out.println("So tien phai thanh toan: " + ans);
    }
}
