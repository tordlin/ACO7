package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public abstract class Employee {
    private String name;
    private int bankAccount;
    private int drink;
    private int perform;


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

    public int getDrink() {
        return drink;
    }

    public int getPerform() {
        return perform;
    }

    public Employee(String name) {
        this.name = name;
    }


    public void perform(){

    }

    public void drink(){

    }
}
