package ua.ithillel.current;

public class RoundChecker {


    public static boolean check(char[][] field, char aiSymbol, char playerSymbol, char emptySymbol) {
        int playerCounter = 0;
        int aiCounter = 0;
        boolean hasNextMove = false;

        for (char[] chars : field) {
            aiCounter = 0;
            playerCounter = 0;

            for (char aChar : chars) {
                if (aChar == aiSymbol) {
                    aiCounter++;
                } else if (aChar == playerSymbol) {
                    playerCounter++;
                } else if (aChar == emptySymbol) {
                    hasNextMove = true;
                }
            }
            if (hasWinner(playerCounter, aiCounter, field.length)) {
                return false;
            }
        }


        for (int i = 0; i < field.length; i++) {
            aiCounter = 0;
            playerCounter = 0;

            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == aiSymbol) {
                    aiCounter++;
                } else if (field[j][i] == playerSymbol) {
                    playerCounter++;
                }
            }
            if (hasWinner(playerCounter, aiCounter, field.length)) {
                return false;
            }
        }
        aiCounter = 0;
        playerCounter = 0;

        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == aiSymbol) {
                aiCounter++;
            } else if (field[i][i] == playerSymbol) {
                playerCounter++;
            }
        }
        if (hasWinner(playerCounter, aiCounter, field.length)) {
            return false;
        }

        aiCounter = 0;
        playerCounter = 0;

        for (int i = 0; i < field.length; i++) {
            if (field[field.length - 1 - i][i] == aiSymbol) {
                aiCounter++;
            } else if (field[field.length - 1 - i][i] == playerSymbol) {
                playerCounter++;
            }
        }

        if (hasWinner(playerCounter, aiCounter, field.length)) {
            return false;
        }

        if (hasNextMove) {
            return true;
        } else {
            System.out.println("Dead heat!!!");
            return false;
        }
    }

    private static boolean hasWinner(int playerCounter, int aiCounter, int fieldLength) {
        if (aiCounter == fieldLength) {
            System.out.println("You lose!!!");
            return true;
        }
        if (playerCounter == fieldLength) {
            System.out.println("You are a winner!!!");
            return true;
        }
        return false;
    }
}
