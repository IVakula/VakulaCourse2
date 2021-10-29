package homework8;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int index = new Random().nextInt(words.length);
        String stringHidden = words[index];
        System.out.println("Компьютер загадал слово:");
        System.out.println("###############");
        boolean comparisonResult;
        do {
            System.out.println("Введите ответ:");
            Scanner scannerInput = new Scanner(System.in);
            String stringPlayer = scannerInput.nextLine();
            comparisonResult = comparison(stringHidden, stringPlayer);
        } while (comparisonResult);
    }

    static boolean comparison(String stringHidden, String stringPlayer) {
        StringBuilder stringBuilderPlayer = new StringBuilder(String.format("%-15s", stringPlayer).replace(" ", "#"));
        StringBuilder stringBuilderHidden = new StringBuilder(String.format("%-15s", stringHidden).replace(" ", "#"));

        for (int i = 0; i < stringBuilderPlayer.length(); i++) {
            if (!(stringBuilderPlayer.charAt(i) == stringBuilderHidden.charAt(i))) {
                stringBuilderPlayer.replace(i, i + 1, "#");
            }
        }

        if (stringBuilderHidden.toString().equals(stringBuilderPlayer.toString())) {
            System.out.println("Ура! Вы отгадали слово! " + stringHidden);
            return false;
        } else {
            System.out.println(stringBuilderPlayer);
            return true;
        }
    }
}
