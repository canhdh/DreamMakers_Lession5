package method;

import javafx.util.converter.CharacterStringConverter;

import java.util.Scanner;

public class Type_Of_Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Nhập ký tự: ");
        string = scanner.nextLine();
        Character character = string.charAt(0);
        if (character.isDigit(character)) System.out.println("Ký tự là một chữ số");
        else
            if (character.isLetter(character)) System.out.println("Ký tự là một chữ cái");
        else System.out.println("Ký tự khác");
    }
}
