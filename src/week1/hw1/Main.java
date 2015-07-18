package week1.hw1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public static void main(String[] args) throws ParseException {
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

    private static Company createData() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();


        Address addressOfMars = new Address();
        addressOfMars.setCountry("Ukraine");
        addressOfMars.setCity("Kiev");
        addressOfMars.setStreet("Hreshatik");
        addressOfMars.setBuilding(12);


        Employee sveta = new Employee();
        sveta.setName("Svetlana");
        sveta.setSex("Female");
        sveta.setAge(23);
        sveta.setAddress("Kiev");
        sveta.setWorkingExperience(24);
        sveta.setSalary(2000);
        sveta.setHireDate(sdf.parse("2013/07/18"));

        Employee kolya = new Employee();
        kolya.setName("Nikolay");
        kolya.setSex("Male");
        kolya.setAge(28);
        kolya.setAddress("Kiev");
        kolya.setWorkingExperience(11);
        kolya.setSalary(1200);
        kolya.setHireDate(sdf.parse("2015/07/12"));

        Employee jack = new Employee();
        jack.setName("Jack");
        jack.setSex("Male");
        jack.setAge(33);
        jack.setAddress("London");
        jack.setWorkingExperience(38);
        jack.setSalary(3800);
        jack.setHireDate(sdf.parse("2012/05/19"));

        Employee john = new Employee();
        john.setName("John");
        john.setSex("Male");
        john.setAge(25);
        john.setAddress("London");
        john.setWorkingExperience(7);
        john.setSalary(900);
        john.setHireDate(sdf.parse("2014/12/19"));

        Employee tory = new Employee();
        tory.setName("Tory");
        tory.setSex("Female");
        tory.setAge(26);
        tory.setAddress("London");
        tory.setWorkingExperience(18);
        tory.setSalary(2500);
        tory.setHireDate(sdf.parse("2014/01/12"));

        Company mars = new Company();
        mars.setName("Mars");
        mars.setAddress(addressOfMars);
        mars.addEmployeeToListOfEmployees(sveta);
        mars.addEmployeeToListOfEmployees(sveta);
        mars.addEmployeeToListOfEmployees(kolya);
        mars.addEmployeeToListOfEmployees(jack);
        mars.addEmployeeToListOfEmployees(john);
        mars.addEmployeeToListOfEmployees(tory);
        mars.setNumberOfEmployees(mars.listOfEmployees.length);
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
