package week2.hw2;

/**
 * Created by Tordlin on 21/07/2015.
 */
public class Cleaner {
    String name;
    int salary;

    public Cleaner(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return name + " - this is name of employee. " + salary + " - this is salary of employee.";
    }

    public void working(){
        System.out.println("I`m cleaning");
    }
}
