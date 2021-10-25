package homework8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Введите исходную строку:");
        String stringSource = scannerInput.nextLine();
        System.out.println("Введите стравниваемую строку:");
        String stringTarget = scannerInput.nextLine();
        System.out.println(findWordPosition(stringSource, stringTarget));
    }

    static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target.charAt(0));
        } else {
            return -1;
        }
    }
}
