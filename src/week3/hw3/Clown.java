package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class Clown extends Employee{
    private int drink = 0;
    private int perform = 0;
    private int bankAccount;

    public Clown(String name) {
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("Very funny!");
        perform++;
    }

    @Override
    public int getPerform() {
        return perform;
    }

    @Override
    public void drink() {
        drink++;
    }
}
