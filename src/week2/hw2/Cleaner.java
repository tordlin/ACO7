package week2.hw2;

/**
 * Created by Tordlin on 21/07/2015.
 */
public class Cleaner extends Employee{
    private String name;
    private int salary;

    public Cleaner(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void working(){
        System.out.println("I`m cleaning");
    }
}
