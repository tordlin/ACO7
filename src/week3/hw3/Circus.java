package week3.hw3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class Circus {
    Scanner sc = new Scanner(System.in);
    private String city;
    Employee[] listOfEmployees = new Employee[8];

    public void setCity(String city) {
        this.city = city;
    }

    public void addEmployeeToListOfEmployees(Employee employee) {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] == null) {
                listOfEmployees[i] = employee;
                break;
            }
        }
    }


    public void showListOfActor() {
        for (int i = 0; i < listOfEmployees.length; i++) {
            System.out.println(i + 1 + ". " +listOfEmployees[i].getName() + " is " + proffessionOfEmployee(listOfEmployees[i]));
        }
    }

    private String proffessionOfEmployee(Employee employee) {
        String proffession = "";
        if (employee instanceof Cyclist) {
            proffession = "Cyclist";
        } else if (employee instanceof AcroJuggler) {
            proffession = "Acrobatic Juggler";
        } else if (employee instanceof Clown) {
            proffession = "Clown";
        } else if (employee instanceof FlyAcrobat) {
            proffession = "Fly Acrobat";
        } else if (employee instanceof Juggler) {
            proffession = "Juggler";
        } else if (employee instanceof RopeWalker) {
            proffession = "Rope Walker";
        } else if (employee instanceof Acrobat) {
            proffession = "Acrobat";
        }
        return proffession;
    }

    public void hireNewEmployee() {
        Employee[] newListOfEmployees = new Employee[listOfEmployees.length + 1];
        for (int i = 0; i < listOfEmployees.length; i++) {
            newListOfEmployees[i] = listOfEmployees[i];
        }

        listOfEmployees = newListOfEmployees;


        System.out.println("Enter name.");
        String newName = sc.nextLine();
        listOfRoles();
        System.out.println("Enter number.");
        int newEmployeeRole = sc.nextInt();

        if (newEmployeeRole == 1) {
            this.addEmployeeToListOfEmployees(new Acrobat(newName));
        } else if (newEmployeeRole == 2) {
            this.addEmployeeToListOfEmployees(new AcroJuggler(newName));
        } else if (newEmployeeRole == 3) {
            this.addEmployeeToListOfEmployees(new Clown(newName));
        } else if (newEmployeeRole == 4) {
            this.addEmployeeToListOfEmployees(new Cyclist(newName));
        } else if (newEmployeeRole == 5) {
            this.addEmployeeToListOfEmployees(new FlyAcrobat(newName));
        } else if (newEmployeeRole == 6) {
            this.addEmployeeToListOfEmployees(new Juggler(newName));
        } else if (newEmployeeRole == 7) {
            this.addEmployeeToListOfEmployees(new RopeWalker(newName));
        }

        System.out.println("You hire new actor.");
    }

    private void listOfRoles() {
        System.out.println("Enter number.");
        System.out.println("1. Acrobat");
        System.out.println("2. Acrobatic Juggler");
        System.out.println("3. Clown");
        System.out.println("4. Cyclist");
        System.out.println("5. Fly Acrobat");
        System.out.println("6. Juggler");
        System.out.println("7. Rope Walker");
    }

    public void fireDrinkestAcrobat() {
        int howManyDrinksWereDrunk = 0;
        int drinkAcrobatCounter = 0;
        int indexOfDrinkestAcrobat = 0;
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] instanceof Acrobat && listOfEmployees[i].getDrink() > 0) {
                drinkAcrobatCounter++;
                if (listOfEmployees[i].getDrink() > howManyDrinksWereDrunk) {
                    howManyDrinksWereDrunk = listOfEmployees[i].getDrink();
                    indexOfDrinkestAcrobat = i;
                }
            }
        }

        int counterForNewListOfEmployees = 0;
        if (drinkAcrobatCounter > 0) {
            listOfEmployees[indexOfDrinkestAcrobat] = null;

            replaceOldListOfEmloyeesToNew();

            drinkAcrobatCounter = 0;
            indexOfDrinkestAcrobat = 0;
        }

        showListOfActor();

    }


    private void replaceOldListOfEmloyeesToNew() {
        Employee[] newListOfEmployees = new Employee[listOfEmployees.length - 1];

        int counterNewMas = 0;

        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] != null) {
                newListOfEmployees[counterNewMas] = listOfEmployees[i];
                counterNewMas++;
            }
        }

        listOfEmployees = newListOfEmployees;
    }

    public void performSomeone() {
        showListOfActor();
        int whoWillPerform = sc.nextInt() - 1;

        listOfEmployees[whoWillPerform].perform();
    }

    public void howManyPerformanceHeHas() {
        showListOfActor();
        int whoWillPerform = sc.nextInt() - 1;

        System.out.println(listOfEmployees[whoWillPerform].getPerform());
    }

    public void giveSalary() {
        System.out.println("How much salary is?");
        int newSalary = sc.nextInt();
        for (int i = 0; i < listOfEmployees.length; i++) {
            listOfEmployees[i].setBankAccount(newSalary);
        }

        for (int i = 0; i < listOfEmployees.length; i++) {
            System.out.println(listOfEmployees[i].getBankAccount());
        }
    }

    public void moveToAnotherCity() {
        System.out.println("Enter new city.");
        String newCity = sc.nextLine();
        setCity(newCity);
        System.out.println("You are moving to " + city);
    }
}
