import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        double AB, BC, AC, ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac canh cua tam giac: ");
        AB = sc.nextDouble();
        BC = sc.nextDouble();
        AC = sc.nextDouble();
        double p = (AB + BC + AC)/2;
        if((AB + AC) > BC && (AB + BC) > AC && (BC + AC) > AB){
            ans = Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
            System.out.println("\nCo the tao thanh tam giac." + "\nS = " + ans);
        }
        else
            System.out.println("\nKhong the tao thanh tam giac");
    }
}
