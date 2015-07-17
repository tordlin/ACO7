package week1.hw1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Tordlin on 13/07/2015.
 */

/*OOP Homework 1.
1. Create an application for company management.
	Employee: name, salary, address, sex, age, working experience (in months)
	Company: name, address, number of employees, list of employees
	Address: Country, city, street, building

	Application should look as a console menu. When application starts, user should see list of possible commands, which are numerated.
  User chooses menu item, after that he sees result of chosen operation.
  Application should work as long as user desires.

	List of possible commands:
	1. Read about company
	2. View list of employees
	3. View employees, which work more than year.
	4. View employees, which are girls and live in Kiev
	5. Add an employee
	6. Fire an employee
	7*. Fire an employee, with salary less then 1000 and which works less then year
	8*. Change an employee information
	9*. View list of employees: first women and then men
	10*. Employee has a hire date(implement class java.util.Date)
	11*. View employees, which works between 100 and 200 hours (use Date)

	* - additional task(optional)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;

        Company mars = createData();

        do {
            Main.callMenu();
            int choose = sc.nextInt();

            if (choose > 0 && choose < 12) {
                if (choose == 1) {
                    //1. Read about company
                    mars.readAboutCompany();
                    exit = isExit(sc, exit);
                } else if (choose == 2) {
                    //2. View list of employees
                    mars.viewListOfEmployees();
                    exit = isExit(sc, exit);
                } else if (choose == 3) {
                    //3. View employees, which work more than year.
                    mars.veiwEmployeesWhichWorkMoreYear();
                    exit = isExit(sc, exit);
                } else if (choose == 4) {
                    //4. View employees, which are girls and live in Kiev
                    mars.viewEmpoyeesGirlsKiev();
                    exit = isExit(sc, exit);
                } else if (choose == 5) {
                    //5. Add an employee
                    mars.addEmployee();
                    exit = isExit(sc, exit);
                } else if (choose == 6) {
                    //6. Fire an employee
                    mars.fireEmployee();
                    exit = isExit(sc, exit);
                } else if (choose == 7) {
                    //7*. Fire an employee, with salary less then 1000 and which works less then year
                    mars.fireEmployeeSalLess1000AndLessYear();
                    exit = isExit(sc, exit);
                } else if (choose == 8) {
                    //8*. Change an employee information
                    mars.changeEmployeeInfo();
                    exit = isExit(sc, exit);
                } else if (choose == 9) {
                    //9*. View list of employees: first women and then men
                    mars.viewListOfEmployeeWomMen();
                    exit = isExit(sc, exit);
                } else if (choose == 10) {
                    //10*. Employee has a hire date(implement class java.util.Date)
                    mars.employeeHasHireDate();
                    exit = isExit(sc, exit);
                } else if (choose == 11) {
                    //11*. View employees, which works between 100 and 200 hours (use Date)
                    mars.viewEmployeesbet100and200();
                    exit = isExit(sc, exit);
                }
            } else {
                System.out.println();
                System.out.println("Please enter correct number of action");
                System.out.println();
                Main.callMenu();
            }
        } while (exit);
    }

    private static Company createData() {
        Address addressOfMars = new Address();
        addressOfMars.country = "Ukraine";
        addressOfMars.city = "Kiev";
        addressOfMars.street = "Hreshatik";
        addressOfMars.building = 12;


        Employee sveta = new Employee();
        sveta.name = "Svetlana";
        sveta.sex = "Female";
        sveta.age = 23;
        sveta.address = "Kiev";
        sveta.workingExperience = 24;
        sveta.salary = 2000;
        sveta.hireDate = new Date(2013, Calendar.JULY, 17);

        Employee kolya = new Employee();
        kolya.name = "Nikolay";
        kolya.sex = "Male";
        kolya.age = 28;
        kolya.address = "Kiev";
        kolya.workingExperience = 11;
        kolya.salary = 1200;
        kolya.hireDate = new Date(2015, Calendar.JUNE, 20);

        Employee jack = new Employee();
        jack.name = "Jack";
        jack.sex = "Male";
        jack.age = 33;
        jack.address = "London";
        jack.workingExperience = 38;
        jack.salary = 3800;
        jack.hireDate = new Date(2012, Calendar.JUNE, 06);

        Employee john = new Employee();
        john.name = "John";
        john.sex = "Male";
        john.age = 25;
        john.address = "London";
        john.workingExperience = 7;
        john.salary = 900;
        john.hireDate = new Date(2014, Calendar.DECEMBER, 03);

        Employee tory = new Employee();
        tory.name = "Tory";
        tory.sex = "Female";
        tory.age = 26;
        tory.address = "London";
        tory.workingExperience = 18;
        tory.salary = 2500;
        tory.hireDate = new Date(2013, Calendar.DECEMBER, 28);

        Company mars = new Company();
        mars.name = "Mars";
        mars.address = addressOfMars;
        mars.listOfEmployees[0] = sveta;
        mars.listOfEmployees[1] = kolya;
        mars.listOfEmployees[2] = jack;
        mars.listOfEmployees[3] = john;
        mars.listOfEmployees[4] = tory;
        mars.numberOfEmployees = mars.listOfEmployees.length;
        return mars;
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
        System.out.println("1. Read about company");
        System.out.println("2. View list of employees");
        System.out.println("3. View employees, which work more than year.");
        System.out.println("4. View employees, which are girls and live in Kiev");
        System.out.println("5. Add an employee");
        System.out.println("6. Fire an employee");
        System.out.println("7*. Fire an employee, with salary less then 1000 and which works less then year");
        System.out.println("8*. Change an employee information");
        System.out.println("9*. View list of employees: first women and then men");
        System.out.println("10*. Employee has a hire date(implement class java.util.Date)");
        System.out.println("11*. View employees, which works between 100 and 200 hours (use Date)");
    }

}
