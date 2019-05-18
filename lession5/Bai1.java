import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        float a, b;
        double ans;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        if(a == 0){
            if(b == 0)
                System.out.println("Phuong trinh da cho co vo so nghiem");
            else
                System.out.println("Phuong trinh da cho vo nghiem");
        }
        else{
            ans = (double) -b/a;
            System.out.println("Phuong trinh co nghiem x = " + ans);
        }
    }
}
