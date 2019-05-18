import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        char x = new Scanner(System.in).nextLine().charAt(0);
        if(Character.isLetter(x))
            System.out.println("Chu cai");
        else if (Character.isDigit(x))
            System.out.println("Chu so");
        else
            System.out.println("Ki tu khac");
    }
}
