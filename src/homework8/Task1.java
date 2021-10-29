package homework8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Введите строку:");
        String stringInput = scannerInput.nextLine();
        System.out.println("Введите символ:");
        String charInput = scannerInput.nextLine();
        char a = charInput.charAt(0);
        System.out.println("Символ в строке \"" + stringInput + "\" встречается " +
                findSymbolOccurrence(stringInput, a) + " раз.");
    }

    static int findSymbolOccurrence(String stringInput, char a) {
        char[] inputCharArray = stringInput.toCharArray();
        int count = 0;
        for (char inputChar : inputCharArray) {
            if (inputChar == a) {
                count++;
            }
        }
        return count;
    }
}
