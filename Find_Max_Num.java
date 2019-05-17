package method;

import java.util.Scanner;

public class Find_Max_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, maxNum = 0, minNum = 0, loop = 4;
        System.out.print("Nhập vào 4 số nguyên a, b, c, d: ");
        while (loop > 0){
            a = scanner.nextInt();
            if (loop == 4) {
                maxNum = minNum = a;
            }
            else{
                if (maxNum < a) maxNum = a;
                if (minNum > a) minNum = a;
            }
            loop--;
        }
        System.out.println("Số nhỏ nhất min = " + minNum + "\nSố lớn nhất max = " + maxNum);
    }
}
