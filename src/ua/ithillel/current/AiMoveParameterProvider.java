package ua.ithillel.current;

import java.util.Random;

public class AiMoveParameterProvider implements MoveParameterProvider {

    public static final char AI_SYMBOL = 'O';

    private final Random random = new Random();
    private final int fieldSize;

    public AiMoveParameterProvider(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    @Override
    public MoveParameters provide() {
        int vertical = random.nextInt(fieldSize);
        int horizontal = random.nextInt(fieldSize);
        return new MoveParameters(AI_SYMBOL, new Coordinate(vertical, horizontal));
    }
}
