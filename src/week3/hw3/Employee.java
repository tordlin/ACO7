package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public abstract class Employee {
    private String name;
    private int bankAccount;

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Employee(String name){
        this.name = name;
    }

    public abstract void perform();
}
