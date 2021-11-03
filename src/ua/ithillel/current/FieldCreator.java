package ua.ithillel.current;

import java.util.Arrays;
import java.util.Scanner;

public class FieldCreator {
    public static final char EMPTY_SYMBOL = '-';
    private static final int MAX_FIELD_SIZE = 10;
    private final Scanner scanner;

    public FieldCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public char[][] create() {
        int dimension;

        do {
            System.out.printf("Please enter field dimension [3-%d] ...", MAX_FIELD_SIZE);
            dimension = scanner.nextInt();
        } while (dimension < 3 || dimension > MAX_FIELD_SIZE);
        char[][] field = new char[dimension][dimension];
        for (char[] chars : field) {
            Arrays.fill(chars, EMPTY_SYMBOL);
        }
        return field;
    }
}
