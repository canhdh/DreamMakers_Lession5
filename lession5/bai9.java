import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        int a, b;
        float ans;
        System.out.println("Nhap vao 2 so nguyen: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Nhap toan tu");
        char x = new Scanner(System.in).nextLine().charAt(0);
        switch (x){
            case '+':
                System.out.println((float) (a + b));
                break;
            case '-':
                System.out.println((float)(a-b));
                break;
            case '*':
                System.out.println((float)(a*b));
                break;
            case '/':
                System.out.println((double) (a/b));
                break;
        }
    }
}
