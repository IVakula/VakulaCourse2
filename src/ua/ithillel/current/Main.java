package ua.ithillel.current;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       TicTacToe ticTacToe = new TicTacToe(scanner);

        char stringCheck;
        do {
            ticTacToe.start();
            do {
                System.out.println("Do you want to star new round? (y/n)");
                scanner.nextLine();
                stringCheck = scanner.nextLine().charAt(0);
            } while (stringCheck != 'n' && stringCheck != 'y');
        } while (stringCheck == 'y');
        System.out.println("Ok. It's time to do something useful!");

    }
}
