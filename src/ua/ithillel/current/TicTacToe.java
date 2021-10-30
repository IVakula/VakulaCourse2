package ua.ithillel.current;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private static final char EMPTY_SYMBOL = '-';
    private static final int MAX_FIELD_SIZE = 10;
    private int fieldSize;
    private final Scanner scanner;
    private char[][] field;

    public TicTacToe(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        createField();

        boolean playerMove = true;

        while (checkResult(field)) {
            CoordinateProvider coordinateProvider = null;
            System.out.println((playerMove ? "Player" : "Computer") + " move");
            if (playerMove) {
                coordinateProvider = new PlayerCoordinateProvider(fieldSize, scanner);
                playerMove = false;
            } else {
                coordinateProvider = new AICoordinateProvider(fieldSize);
                playerMove = true;
            }
            doMove(coordinateProvider);
            drawField();
        }
        System.out.println("Game over!!!!!");

    }

    private void doMove(CoordinateProvider coordinateFinder) {
        MoveResult moveResult;
        Coordinate coordinate;

        do {
            moveResult = coordinateFinder.provideCoordinate();
            coordinate = moveResult.getCoordinate();
        } while (field[coordinate.getVertical()][coordinate.getHorizontal()] != EMPTY_SYMBOL);

        field[coordinate.getVertical()][coordinate.getHorizontal()] = moveResult.getSymbol();
    }

    private void createField() {
        int dimension;

        do {
            System.out.printf("Please enter field dimension [3-%d] ...", MAX_FIELD_SIZE);
            dimension = scanner.nextInt();
        } while (dimension < 3 || dimension > MAX_FIELD_SIZE);
        this.fieldSize = dimension;
        this.field = new char[dimension][dimension];
        for (char[] chars : field) {
            Arrays.fill(chars, EMPTY_SYMBOL);
        }
    }

    private void drawField() {
        for (char[] chars : field) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(chars[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private boolean checkResult(char[][] field) {
        StringBuilder stringCheck = new StringBuilder();
        for (char[] chars : field) {
            for (char aChar : chars) {
                stringCheck.append(aChar);
            }
            stringCheck.append(" ");
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                stringCheck.append(field[j][i]);
            }
            stringCheck.append(" ");
        }

        for (int i = 0; i < field.length; i++) {
            stringCheck.append(field[i][i]);
        }
        stringCheck.append(" ");

        for (int i = 0; i < field.length; i++) {
            stringCheck.append(field[field.length - 1 - i][i]);
        }

        StringBuilder stringCompareX = new StringBuilder();
        StringBuilder stringCompareO = new StringBuilder();

        for (int i = 0; i < fieldSize; i++) {
            stringCompareX.append("X");
            stringCompareO.append("O");
        }

        String stringCompare = stringCheck.toString();

        if (stringCompare.contains(stringCompareX)) {
            System.out.println("You are a winner!!!");
            return false;
        } else if (stringCompare.contains(stringCompareO)) {
            System.out.println("You lose!!!");
            return false;
        } else if (stringCompare.contains(String.valueOf(EMPTY_SYMBOL))) {
            return true;
        } else {
            System.out.println("Dead heat!!!");
            return false;
        }
    }
}
