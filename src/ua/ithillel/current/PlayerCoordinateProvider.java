package ua.ithillel.current;

import java.util.Scanner;

public class PlayerCoordinateProvider implements CoordinateProvider {

    private static final char PLAYER_SYMBOL = 'X';
    private final int fieldSize;
    private final Scanner scanner;

    public PlayerCoordinateProvider(int fieldSize, Scanner scanner) {
        this.fieldSize = fieldSize;
        this.scanner = scanner;
    }

    @Override
    public MoveResult provideCoordinate() {
        int vertical = chooseCoordinate('v');
        int horizontal = chooseCoordinate('h');
        return new MoveResult(PLAYER_SYMBOL, new Coordinate(vertical, horizontal));
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
