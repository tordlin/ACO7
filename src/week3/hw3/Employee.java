package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public abstract class Employee {
    private String name;
    private int bankAccount;
    private int counterDrink;
    private int counterPerform;


    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setCounterDrink(int counterDrink) {
        this.counterDrink = counterDrink;
    }

    public void setCounterPerform(int counterPerform) {
        this.counterPerform = counterPerform;
    }

    public int getCounterDrink() {
        return counterDrink;
    }

    public int getCounterPerform() {
        return counterPerform;
    }

    public Employee(String name) {
        this.name = name;
    }


    public abstract void perform();

    public abstract void drink();
}
