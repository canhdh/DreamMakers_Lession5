package method;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Number_Of_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 400 == 0|| (n % 4 == 0 && n % 100 != 0)) System.out.println("Năm " + n + " có 366 ngày");
        else System.out.println("Năm " + n + " có 365 ngày");
    }
}
