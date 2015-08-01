package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class RopeWalker extends Employee{

    @Override
    public void setBankAccount(int bankAccount) {
        this.getBankAccount() = (int) (bankAccount + bankAccount * 0.1);
    }

    public RopeWalker(String name) {
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("Walking in the sky!");
        int temp = getCounterPerform();
        temp++;
        setCounterPerform(temp);
    }

    @Override
    public void drink() {
        System.out.println("Drinking");
        int temp = getCounterDrink();
        temp++;
        setCounterDrink(temp);
    }
}
