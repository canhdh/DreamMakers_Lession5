import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class bai2 {
    public static void giaiPTbac2(double a, double b, double c){
        if(a == 0){
            if(b == 0){
                if(c == 0)
                    System.out.println("Phuong trinh co vo so nghiem");
                else
                    System.out.println("Phuong trinh vo nghiem");
            }
            else
                System.out.println("Phuong trinh co nghiem duy nhat" + "x = " + (-c/b));
        }
        double delta = b*b - 4*a*c;
        double x1, x2;
        if(delta == 0){
            x1 = (-b)/(2*a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 =" + x1);
        }
        else if(delta > 0){
            x1 = ((-b + Math.sqrt(delta)) / (2*a));
            x2 = ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh da cho co 2 nghiem phan biet:\n" + "x1 = " + x1 + "\nx2 = " + x2 );
        }
        else
            System.out.println("Phuong trinh vo nghiem");
    }
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("nhap a, b, c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        giaiPTbac2(a, b, c);
    }
}
