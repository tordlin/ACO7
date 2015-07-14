package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 13/07/2015.
 */

/*Company: name, address, number of employees, list of employees*/

public class Company {
    String name;
    Address address;
    int numberOfEmployees;
    Employee[] listOfEmployees = new Employee[10];
    Scanner sc = new Scanner(System.in);

    public void readAboutCompany() {
        System.out.println("Name = " + name);
        System.out.println("Address = " + address.showAddress());
        System.out.println("Number of Employees = " + numberOfEmployees);
    }

    public void viewListOfEmployees() {
        for(int i = 0; i < listOfEmployees.length; i++){
            if(listOfEmployees[i] != null) {
                System.out.println(listOfEmployees[i].showEmployee());
            }
        }
    }

    public void veiwEmployeesWhichWorkMoreYear() {
        for(int i = 0; i < listOfEmployees.length; i++){
            if(listOfEmployees[i].workingExperience > 12)
            System.out.println(listOfEmployees[i].showEmployee());
        }
    }

    public void viewEmpoyeesGirlsKiev() {
        for(int i = 0; i < listOfEmployees.length; i++){
            if(listOfEmployees[i].sex.equals("Female") && listOfEmployees[i].address.equals("Kiev"))
                System.out.println(listOfEmployees[i].showEmployee());
        }
    }

    public void addEmployee() {
        Employee newEmployee = new Employee();
        System.out.println("Enter name");
        newEmployee.name = sc.nextLine();
        System.out.println("Enter sex");
        newEmployee.sex = sc.nextLine();
        System.out.println("Enter age");
        newEmployee.age = sc.nextInt();
        System.out.println("Enter address");
        newEmployee.address = sc.nextLine();
        System.out.println("Enter salary");
        newEmployee.salary = sc.nextInt();
        System.out.println("Enter working Experience");
        newEmployee.workingExperience = sc.nextInt();

        for(int i = 0; i < listOfEmployees.length; i++){
            if(listOfEmployees[i] == null){
                listOfEmployees[i] = newEmployee;
                break;
            }
        }
        viewListOfEmployees();
    }

    public void fireEmployee() {
        viewListOfEmployees();
        System.out.println("Which employee you will fire? Enter name");
        String fireName = sc.nextLine();
        for(int i = 0; i < listOfEmployees.length; i++){
            if(listOfEmployees[i] != null) {
                if (listOfEmployees[i].name.equals(fireName)) {
                    listOfEmployees[i] = null;
                }
            }
        }
        System.out.println();
        viewListOfEmployees();
    }

    public void fireEmployeeSalLess1000AndLessYear() {
        String[] fireEmployeeName = new String[listOfEmployees.length];
        int couter = 0;

        for(int i = 0; i < listOfEmployees.length; i++){
            if(listOfEmployees[i] != null) {
                if (listOfEmployees[i].salary < 1000 && listOfEmployees[i].workingExperience < 12) {
                    fireEmployeeName[couter] = listOfEmployees[i].name;
                    couter++;
                }
            }
        }

        for(int i = 0; i < fireEmployeeName.length;i++){
            if(fireEmployeeName[i] != null) {
                 for(int j = 0; j < listOfEmployees.length; j++) {
                     if (listOfEmployees[j] != null) {
                         if (fireEmployeeName[i] == listOfEmployees[j].name) {
                             listOfEmployees[j] = null;
                         }
                      }
                 }
            }
        }
        System.out.println();
        viewListOfEmployees();
    }

    public void changeEmployeeInfo() {

    }

    public void viewLostOfEmployeeWomMen() {

    }

    public void employeeHasHireDate() {

    }

    public void viewEmployeesbet100and200() {

    }
}
