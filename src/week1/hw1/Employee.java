package week1.hw1;

import java.util.Date;

/**
 * Created by Tordlin on 13/07/2015.
 */

/*Employee: name, salary, address, sex, age, working experience (in months)*/

public class Employee {
    String name;
    int salary;
    String address;
    String sex;
    int age;
    int workingExperience;

    public String showEmployee() {
        String employee = name + ", " + sex + ", age = " + age + ", address = " + address + ", salary = "
                + salary + ", working experience = " + workingExperience;
        return employee;
    }
}
