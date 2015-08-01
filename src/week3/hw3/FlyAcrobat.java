package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class FlyAcrobat extends Acrobat{
    private int drink = 0;
    private int perform = 0;
    private int bankAccount;

    public FlyAcrobat(String name) {
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("Fly acrobation!");
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
