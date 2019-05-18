package method;

import java.util.Scanner;

public class Electrical_Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElectrical, unit1 = 0, unit2 = 0, unit3 = 0, unit4 = 0, bill = 0;
        System.out.print("Nhập số điện: ");
        numberOfElectrical = scanner.nextInt();

        if (numberOfElectrical <= 50) unit1 = numberOfElectrical;
        else {
            unit1 = 50;
            numberOfElectrical -= 50;
            if (numberOfElectrical <= 50) unit2 = numberOfElectrical;
            else {
                unit2 = 50;
                numberOfElectrical -= 50;
                if (numberOfElectrical <= 100) unit3 = numberOfElectrical;
                else {
                    unit3 = 100;
                    unit4 = numberOfElectrical - 100;
                }
            }
        }

        bill = unit1 * 550 + unit2 * 850 + unit3 * 1200 + unit4 * 1500;
        System.out.println("Số tiền điền phải trả là: " + bill);
    }
}
