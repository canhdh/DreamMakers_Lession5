import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap ngay:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%7 == 1)
            System.out.println("Thu 7");
        else if(n%7 == 2)
            System.out.println("Chu nhat");
        else if(n%7 == 3)
            System.out.println("Thu 2");
        else if(n%7 == 4)
            System.out.println("Thu 3");
        else if(n%7 == 5)
            System.out.println("Thu 4");
        else if(n%7 == 6)
            System.out.println("Thu 5");
        else
            System.out.println("Thu 6");
    }
}
