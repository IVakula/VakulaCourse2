package homework8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Введите исходную строку:");
        String stringInput = scannerInput.nextLine();
        System.out.println(stringReverse(stringInput));
    }

    static String stringReverse(String stringInput) {
        return new StringBuilder(stringInput).reverse().toString();
    }
}
