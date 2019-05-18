import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        float xA, yA;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa dd diem A: ");
        xA = sc.nextInt();
        yA = sc.nextInt();
        if(xA <= 1 && xA >= -1 && yA <= 1 && yA >= -1)
            System.out.println("A thuoc duong tron");
        else
            System.out.println("A khong thuoc duong tron");
    }
}
