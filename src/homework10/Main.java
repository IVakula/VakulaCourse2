package homework10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "1", "2", "1"},
                {"1", "-1", "1", "1" },
                {"1", "asd", "-2", "1"},
                {"1", "0", "6", "0" }};
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        try {
            System.out.println("The sum of the cell values is " + arrayValueCalculator.doCalc(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }
}
