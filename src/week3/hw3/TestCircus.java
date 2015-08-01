package week3.hw3;


import java.text.ParseException;
import java.util.Scanner;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class TestCircus {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;

        Circus circus = hireStuff();

        do {
            TestCircus.callMenu();
            int choose = sc.nextInt();

            if (choose > 0 && choose < 8) {

                switch (choose) {
                    case 1:
                        circus.showListOfActor();
                        exit = isExit(sc, exit);
                        break;
                    case 2:
                        circus.hireNewEmployee();
                        exit = isExit(sc, exit);
                        break;
                    case 3:
                        circus.fireDrinkestAcrobat();
                        exit = isExit(sc, exit);
                        break;
                    case 4:
                        circus.performSomeone();
                        exit = isExit(sc, exit);
                        break;
                    case 5:
                        circus.howManyPerformanceHeHas();
                        exit = isExit(sc, exit);
                        break;
                    case 6:
                        circus.giveSalary();
                        exit = isExit(sc, exit);
                        break;
                    case 7:
                        circus.moveToAnotherCity();
                        exit = isExit(sc, exit);
                        break;

                }
            } else {
                System.out.println();
                System.out.println("Please enter correct number of action");
                System.out.println();
            }
        } while (exit);
    }


    private static Circus hireStuff() {
        Circus circus = new Circus();
        Clown clown = new Clown("Vint");
        Acrobat acrobat = new Acrobat("Opium");
        acrobat.drink();
        acrobat.drink();
        Acrobat acrobat2 = new Acrobat("Gashik");
        acrobat2.drink();
        acrobat2.drink();
        acrobat2.drink();
        FlyAcrobat flyAcrobat = new FlyAcrobat("OpiumLight");
        Juggler juggler = new Juggler("Koks");
        Cyclist cyclist = new Cyclist("Krec");
        AcroJuggler acroJuggler = new AcroJuggler("Spice");
        acroJuggler.drink();
        RopeWalker ropeWalker = new RopeWalker("Pill");
        Employee[] listOfEmpoyees = new Employee[8];
        circus.addEmployeeToListOfEmployees(clown);
        circus.addEmployeeToListOfEmployees(acrobat);
        circus.addEmployeeToListOfEmployees(acrobat2);
        circus.addEmployeeToListOfEmployees(flyAcrobat);
        circus.addEmployeeToListOfEmployees(juggler);
        circus.addEmployeeToListOfEmployees(cyclist);
        circus.addEmployeeToListOfEmployees(acroJuggler);
        circus.addEmployeeToListOfEmployees(ropeWalker);

        return circus;
    }

    private static boolean isExit(Scanner sc, boolean exit) {
        System.out.println("Do you want to continue? Choose number");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int questionAboutExit = sc.nextInt();
        if (questionAboutExit == 1) {
            exit = true;
        } else {
            exit = false;
        }
        return exit;
    }

    private static void callMenu() {
        System.out.println("1. Show list of actor.");
        System.out.println("2. Hire new employee.");
        System.out.println("3. Fire the drinkest acrobat.");
        System.out.println("4. Perform someone.");
        System.out.println("5. How many performance he has?");
        System.out.println("6. Give salary (ropewalkers take additional 10%).");
        System.out.println("7. Move to another city.");
    }
}
