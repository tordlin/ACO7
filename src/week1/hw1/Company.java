package week1.hw1;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Tordlin on 13/07/2015.
 */

/*Company: name, address, number of employees, list of employees*/

public class Company {
    private String name;
    private Address address;
    private int numberOfEmployees;
    Employee[] listOfEmployees = new Employee[5];
    Scanner sc = new Scanner(System.in);

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public void readAboutCompany() {
        System.out.println("Name = " + getName());
        System.out.println("Address = " + getAddress().showAddress());
        System.out.println("Number of Employees = " + getNumberOfEmployees());
    }

    public void viewListOfEmployees() {
        for (int i = 0; i < listOfEmployees.length; i++) {
            System.out.println(listOfEmployees[i].showEmployee());
        }
    }

    public void veiwEmployeesWhichWorkMoreYear() {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getWorkingExperience() > 12)
                System.out.println(listOfEmployees[i].showEmployee());
        }
    }

    public void viewEmpoyeesGirlsKiev() {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] != null) {
                if (listOfEmployees[i].getSex().equals("Female") && listOfEmployees[i].getAddress().equals("Kiev"))
                    System.out.println(listOfEmployees[i].showEmployee());
            }
        }
    }

    public void addEmployee() {
        Employee newEmployee = new Employee();
        System.out.println("Enter name");
        newEmployee.setName(sc.nextLine());
        System.out.println("Enter sex");
        newEmployee.setSex(sc.nextLine());
        System.out.println("Enter address");
        newEmployee.setAddress(sc.nextLine());
        System.out.println("Enter age");
        newEmployee.setAge(sc.nextInt());
        System.out.println("Enter salary");
        newEmployee.setSalary(sc.nextInt());
        newEmployee.setWorkingExperience(0);
        newEmployee.setHireDate(new Date());

        Employee[] newListOfEmployees = new Employee[listOfEmployees.length + 1];

        for (int i = 0; i < listOfEmployees.length; i++) {
            newListOfEmployees[i] = listOfEmployees[i];
        }

        newListOfEmployees[newListOfEmployees.length - 1] = newEmployee;

        listOfEmployees = newListOfEmployees;

        numberOfEmployees++;

        viewListOfEmployees();
    }

    public void fireEmployee() {
        viewListOfEmployees();
        System.out.println("Which employee you will fire? Enter name");
        String fireName = sc.nextLine();

        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getName().equals(fireName)) {
                listOfEmployees[i] = null;
            }
        }

        replaceOldListOfEmloyeesToNew();

        numberOfEmployees--;

        viewListOfEmployees();
    }

    public void fireEmployeeSalLess1000AndLessYear() {
        String[] fireEmployeeName = new String[listOfEmployees.length];
        int couter = 0;

        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getSalary() < 1000 && listOfEmployees[i].getWorkingExperience() < 12) {
                fireEmployeeName[couter] = listOfEmployees[i].getName();
                couter++;
            }
        }

        for (int i = 0; i < fireEmployeeName.length; i++) {
            if (fireEmployeeName[i] != null) {
                for (int j = 0; j < listOfEmployees.length; j++) {
                    if (fireEmployeeName[i] == listOfEmployees[j].getName()) {
                        listOfEmployees[j] = null;
                        numberOfEmployees--;
                    }
                }
            }
        }
        replaceOldListOfEmloyeesToNew();

        viewListOfEmployees();
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

    public void changeEmployeeInfo() {
        viewListOfEmployees();
        System.out.println("Which employee information you want to change? Please enter name");
        String employeeName = sc.nextLine();
        Employee changedEmloyee = null;

        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getName().equals(employeeName)) {
                changedEmloyee = listOfEmployees[i];
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

        if (changeFieled.equals("1")) {
            changedEmloyee.setName(newValue);
        } else if (changeFieled.equals("2")) {
            changedEmloyee.setSex(newValue);
        } else if (changeFieled.equals("3")) {
            changedEmloyee.setAge(Integer.parseInt(newValue));
        } else if (changeFieled.equals("4")) {
            changedEmloyee.setAddress(newValue);
        } else if (changeFieled.equals("5")) {
            changedEmloyee.setSalary(Integer.parseInt(newValue));
        } else if (changeFieled.equals("6")) {
            changedEmloyee.setWorkingExperience(Integer.parseInt(newValue));
        }

        System.out.println(changedEmloyee.showEmployee());
    }

    public void viewListOfEmployeeWomMen() {
        Employee[] women = new Employee[listOfEmployees.length];
        int counterWomen = 0;
        Employee[] men = new Employee[listOfEmployees.length];
        int counterMen = 0;
        Employee[] whichWeShow = new Employee[listOfEmployees.length];
        int counterShow = 0;

        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getSex().equals("Female")) {
                women[counterWomen] = listOfEmployees[i];
                counterWomen++;
            } else {
                men[counterMen] = listOfEmployees[i];
                counterMen++;
            }
        }

        for (int i = 0; i < women.length; i++) {
            if (women[i] != null) {
                whichWeShow[counterShow] = women[i];
                counterShow++;
            }
        }

        for (int i = 0; i < men.length; i++) {
            if (men[i] != null) {
                whichWeShow[counterShow] = men[i];
                counterShow++;
            }
        }

        for (int i = 0; i < whichWeShow.length; i++) {
            if (whichWeShow[i] != null) {
                System.out.println(whichWeShow[i].showEmployee());
            }
        }
    }

    public void employeeHasHireDate() {

    }

    public void viewEmployeesbet100and200() {
        final int WORK_HOUR_TO_MILLISEC = 1000 * 60 * 60 / 3 * 5 / 7;
        Date currentDate = new Date();
        for (int i = 0; i < listOfEmployees.length; i++) {

            Employee empl = listOfEmployees[i];
            long millis = currentDate.getTime() - empl.getHireDate().getTime();
            long hours = millis / 1000 / 60 / 60;

            if(100 <= hours && hours <= 200){
                System.out.println(empl.showEmployee());
            }

            /*System.out.println(currentDate.getTime());
            System.out.println(listOfEmployees[i].hireDate.getTime());*/
        }
    }

    public void addEmployeeToListOfEmployees(Employee name) {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] == null) {
                listOfEmployees[i] = name;
                break;
            }
        }
    }
}
