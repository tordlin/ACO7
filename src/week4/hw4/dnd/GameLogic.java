package week4.hw4.dnd;

import java.util.Scanner;

/**
 * Created by Tordlin on 12/08/2015.
 */
public class GameLogic {
    Scanner sc = new Scanner(System.in);
    int choosedPerson;
    int choosedOpponent;
    Person person;
    Person opponent;


    public void callChoosingPersonMenu() {

    }

    public void callChoosingWeaponMenu() {

    }

    public void callChoosingOpponentMenu() {

    }

    public boolean fight(boolean exitFromGame) {
        exitFromGame = callExitMenu(exitFromGame);
        return exitFromGame;
    }

    private boolean callExitMenu(boolean exitFromGame) {
        Scanner sc = new Scanner(System.in);

        boolean exitFromMenu = true;

        System.out.println("Choose action!");
        System.out.println();
        System.out.println("1. Repeat battle!");
        System.out.println("2. Another battle!");
        System.out.println("3. Quit.");

        int choose = sc.nextInt();

        while (exitFromMenu) {

            switch (choose) {
                case 1:
                    fight(exitFromGame);
                    break;
                case 2:
                    exitFromMenu = false;
                    break;
                case 3:
                    exitFromMenu = false;
                    exitFromGame = false;
                    break;
                default:
                    System.out.println("Please choose from menu.");
                    System.out.println();
                    exitFromMenu = false;
                    break;
            }
        }
        return exitFromMenu;
    }
}
