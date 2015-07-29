package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class Circus {
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

    }

    public void hireNewEmployee() {

    }

    public void fireDrinkestAcrobat() {

    }

    public void performSomeone() {

    }

    public void howManyPerformanceHeHas() {

    }

    public void giveSalary() {

    }

    public void moveToAnotherCity() {

    }
}
