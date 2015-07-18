package week1.hw1;

import java.util.Date;

/**
 * Created by Tordlin on 13/07/2015.
 */

/*Employee: name, salary, address, sex, age, working experience (in months)*/

public class Employee {


    private String name;
    private int salary;
    private String address;
    private String sex;
    private int age;
    private int workingExperience;
    private Date hireDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(int workingExperience) {
        this.workingExperience = workingExperience;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String showEmployee() {
        String employee = getName() + ", " + getSex() + ", age = " + getAge() + ", address = " + getAddress() + ", salary = "
                + getSalary() + ", working experience = " + getWorkingExperience() + ", hire date = " + getHireDate();
        return employee;
    }
}
