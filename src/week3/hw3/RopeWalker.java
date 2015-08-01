package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class RopeWalker extends Employee{
    private int drink = 0;
    private int perform = 0;
    private int bankAccount;

    @Override
    public void setBankAccount(int bankAccount) {
        this.bankAccount = (int) (bankAccount + bankAccount * 0.1);
    }

    @Override
    public int getBankAccount() {
        return bankAccount;
    }

    public RopeWalker(String name) {
        super(name);
    }

    @Override
    public int getPerform() {
        return perform;
    }

    @Override
    public void perform() {
        System.out.println("Walking in the fly!");
        perform++;
    }

    @Override
    public void drink() {
        drink++;
    }
}
