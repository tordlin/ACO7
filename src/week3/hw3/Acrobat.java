package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class Acrobat extends Employee{
    private int drink = 0;
    private int perform = 0;
    private int bankAccount;

    public Acrobat(String name) {
        super(name);
    }

    public int getDrink() {
        return drink;
    }

    @Override
    public int getPerform() {
        return perform;
    }

    @Override
    public void perform() {
        System.out.println("Acrobating!");
        perform++;
    }

    @Override
    public void drink() {
        drink++;
    }


}
