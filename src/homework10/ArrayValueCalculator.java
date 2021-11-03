package homework10;

public class ArrayValueCalculator {

    public int doCalc(String[][] array) throws MyArraySizeException, MyArrayDataException, ArrayIndexOutOfBoundsException {
        if (array.length != 4) {
            throw new MyArraySizeException("Wrong array size (columns)");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Wrong array size at line " + (i+1));
            }
        }

        int sum = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum+= Integer.parseInt(String.valueOf(array[i][j]));
                    } catch (NumberFormatException dataException) {
                       throw new MyArrayDataException("Incorrect data in the cell: [" + i + "][" + j +
                               "]. Details: "+dataException.getMessage(),dataException);
                    }
                }
            }

        return sum;
    }

}