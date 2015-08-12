package week4.hw4.dnd;

import java.util.Scanner;

/**
 * Created by Tordlin on 12/08/2015.
 */
public class Main {
    public static void main(String[] args) {

        boolean exitFromGame = true;

        System.out.println("Welcome to our DnD game!");
        System.out.println();

        while (exitFromGame) {

            GameLogic gameLogic = new GameLogic();

            gameLogic.callChoosingPersonMenu();

            gameLogic.callChoosingWeaponMenu();

            gameLogic.callChoosingOpponentMenu();

            exitFromGame = gameLogic.fight(exitFromGame);

        }

    }
}
