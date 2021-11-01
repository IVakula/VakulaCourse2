package ua.ithillel.current;

import java.util.Scanner;

public class PlayerMoveParameterProvider implements MoveParameterProvider {

    public static final char PLAYER_SYMBOL = 'X';
    private final int fieldSize;
    private final Scanner scanner;

    public PlayerMoveParameterProvider(int fieldSize, Scanner scanner) {
        this.fieldSize = fieldSize;
        this.scanner = scanner;
    }


    @Override
    public MoveParameters provide() {
        int vertical = chooseCoordinate('v');
        int horizontal = chooseCoordinate('h');
        return new MoveParameters(PLAYER_SYMBOL, new Coordinate(vertical, horizontal));
    }

    private int chooseCoordinate(char coordinateSymbol) {
        int coordinate;

        do {
            System.out.printf("Please enter %s-coordinate [1-" + fieldSize + "] ...%n", coordinateSymbol);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= fieldSize);

        return coordinate;
    }
}
