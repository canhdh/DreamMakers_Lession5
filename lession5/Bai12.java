import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        int AB, AC, BC;
        System.out.println("Nhap cac canh cua tam giac");
        Scanner sc = new Scanner(System.in);
        AB = sc.nextInt();
        BC = sc.nextInt();
        AC = sc.nextInt();
        if(AB == AC || AB == BC || AC == BC){
            if(AB == AC && AB == BC)
                System.out.println("Tam giac deu");
            else if(AB*AB + BC*BC == AC*AC || AB*AB + AC*AC == BC*BC || BC*BC + AC*AC == AB*AB)
                System.out.println("Tam giac vuong can");
            else
                System.out.println("Tam giac can");
        }
        else
            System.out.println("Tam giac thuong");
    }
}
