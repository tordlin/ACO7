package week2.hw2;

/**
 * Created by Tordlin on 21/07/2015.
 */
public class SoftwareIngineer extends Employee{
    private String name;
    private int salary;

    public SoftwareIngineer (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void working(){
        System.out.println("I`m coding");
    }
}
