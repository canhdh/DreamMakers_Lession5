import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int n;
        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int min = array[0], max = array[0];
        for(int i = 0; i < n; i++) {
            if (array[i] < min)
                min = array[i];
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("Gia tri nho nhat la: " + min);
        System.out.println("Gia tri lon nhat laf: " + max);
    }
}
