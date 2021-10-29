package homework8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Введите исходную строку:");
        String stringInput = scannerInput.nextLine();
        System.out.println(isPalindrome(stringInput));
    }

    static boolean isPalindrome(String stringInput) {
        int n = stringInput.length();
        for (int i = 0; i < n / 2; i++) {
            if (stringInput.charAt(i) != stringInput.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
