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
        viewListOfEmployees();
        System.out.println("Which employee information you want to change? Please enter name");
        String employeeName = sc.nextLine();
        Employee changedEmloyee = null;

        for (int i = 0; i < listOfEmployees.length; i++) {
            if(listOfEmployees[i] != null){
               if(listOfEmployees[i].name.equals(employeeName)){
                   changedEmloyee = listOfEmployees[i];
               }
            }
        }
        changedEmloyee.showEmployee();
        System.out.println("What do you want to change? Enter number");
        System.out.println("1. name");
        System.out.println("2. sex");
        System.out.println("3. age");
        System.out.println("4. address");
        System.out.println("5. salary");
        System.out.println("6. work experience");
        Scanner sc = new Scanner(System.in);
        String changeFieled = sc.nextLine();
        System.out.println("Enter new value");
        String newValue = sc.nextLine();

        if(changeFieled.equals("1")){
            changedEmloyee.name = newValue;
        }else if(changeFieled.equals("2")){
            changedEmloyee.sex = newValue;
        }else if(changeFieled.equals("3")){
            changedEmloyee.age = Integer.parseInt(newValue);
        }else if(changeFieled.equals("4")){
            changedEmloyee.address = newValue;
        }else if(changeFieled.equals("5")){
            changedEmloyee.salary = Integer.parseInt(newValue);
        }else if(changeFieled.equals("6")){
            changedEmloyee.workingExperience = Integer.parseInt(newValue);
        }

        System.out.println(changedEmloyee.showEmployee());


    }

    public void viewLostOfEmployeeWomMen() {
        Employee[] women = new Employee[listOfEmployees.length];
        int counterWomen = 0;
        Employee[] men = new Employee[listOfEmployees.length];
        int counterMen = 0;
        Employee[] whichWeShow = new Employee[listOfEmployees.length];
        int counterShow = 0;

        for (int i = 0; i < listOfEmployees.length; i++) {
            if(listOfEmployees[i] != null){
                if(listOfEmployees[i].sex.equals("Female")){
                    women[counterWomen] = listOfEmployees[i];
                    counterWomen++;
                }else{
                    men[counterMen] = listOfEmployees[i];
                    counterMen++;
                }
            }
        }

        for (int i = 0; i < women.length; i++) {
            if(women[i] != null){
                whichWeShow[counterShow] = women[i];
                counterShow++;
            }
        }

        for (int i = 0; i < men.length; i++) {
            if(men[i] != null){
                whichWeShow[counterShow] = men[i];
                counterShow++;
            }
        }

        for(int i = 0; i < whichWeShow.length; i++){
            if(whichWeShow[i] != null) {
                System.out.println(whichWeShow[i].showEmployee());
            }
        }
    }

    public void employeeHasHireDate() {

    }

    public void viewEmployeesbet100and200() {

    }
}
