package ua.ithillel.current;

public class MoveParameters {
    private final char symbol;
    private final Coordinate coordinate;

    public MoveParameters(char symbol, Coordinate coordinate) {
        this.symbol = symbol;
        this.coordinate = coordinate;
    }

    public char getSymbol() {
        return symbol;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
