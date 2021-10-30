package ua.ithillel.current;

import java.util.Random;

public class AICoordinateProvider implements CoordinateProvider {

    private static final char AI_SYMBOL = 'O';

    private final Random random = new Random();
    private final int fieldSize;

    public AICoordinateProvider(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    @Override
    public MoveResult provideCoordinate() {
        int vertical = random.nextInt(fieldSize);
        int horizontal = random.nextInt(fieldSize);
        return new MoveResult(AI_SYMBOL, new Coordinate(vertical, horizontal));
    }
}
