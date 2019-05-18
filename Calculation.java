package method;

import java.util.Scanner;
import java.io.IOException;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, result;
        Character character;
        System.out.println("Nhập 2 số a, b và phép toán:");
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.println("Phép toán: ");
        character = new Scanner(System.in).nextLine().charAt(0);

        System.out.print("Kết quả của phép toán " + a + " " + character + " " + b + " = ");
        switch (character){
            case '+':{
                result = a + b;
                System.out.println(result);
                break;
            }
            case '-':{
                result = a - b;
                System.out.println(result);
                break;
            }
            case '*':{
                result = a * b;
                System.out.println(result);
                break;
            }
            case '/':{
                result = a / b;
                System.out.println(result);
                break;
            }
        }
    }
}
