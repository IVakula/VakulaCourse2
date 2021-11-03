package ua.ithillel.current;

import java.util.Scanner;

public class TicTacToe {

    private final Scanner scanner;
    private final FieldCreator fieldCreator;
    private char[][] field;

    public TicTacToe() {
        this.scanner = new Scanner(System.in);
        this.fieldCreator = new FieldCreator(scanner);
    }

    public void start() {
        char stringCheck;
        do {
            startRound();
            do {
                System.out.println("Do you want to star new round? (y/n)");
                scanner.nextLine();
                stringCheck = scanner.nextLine().charAt(0);
            } while (stringCheck != 'n' && stringCheck != 'y');
        } while (stringCheck == 'y');
        System.out.println("Ok. It's time to do something useful!");
    }

    private void startRound() {

        this.field = this.fieldCreator.create();
        int fieldSize = this.field.length;

        MoveParameterProvider playerProvider = new PlayerMoveParameterProvider(fieldSize, scanner);
        MoveParameterProvider aiProvider = new AiMoveParameterProvider(fieldSize);
        boolean playerMove = true;
        drawField();

        while (RoundChecker.check(field, AiMoveParameterProvider.AI_SYMBOL, PlayerMoveParameterProvider.PLAYER_SYMBOL, FieldCreator.EMPTY_SYMBOL)) {
            System.out.println((playerMove ? "Player" : "Computer") + " move");
            if (playerMove) {
                doMove(playerProvider);
                playerMove = false;
            } else {
                doMove(aiProvider);
                playerMove = true;
            }
            drawField();
        }
        System.out.println("Game over!!!!!");

    }

    private void doMove(MoveParameterProvider moveParameterProvider) {
        MoveParameters moveParameters;
        Coordinate coordinate;

        do {
            moveParameters = moveParameterProvider.provide();
            coordinate = moveParameters.getCoordinate();
        } while (field[coordinate.getVertical()][coordinate.getHorizontal()] != FieldCreator.EMPTY_SYMBOL);

        field[coordinate.getVertical()][coordinate.getHorizontal()] = moveParameters.getSymbol();
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

}

