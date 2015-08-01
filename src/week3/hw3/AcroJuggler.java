package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class AcroJuggler extends Acrobat{
    private int drink = 0;
    private int perform = 0;
    private int bankAccount;

    public AcroJuggler(String name) {
        super(name);
    }

    @Override
    public int getPerform() {
        return perform;
    }

    @Override
    public void perform() {
        System.out.println("Acrobatic juggling!");
        perform++;
    }

    @Override
    public void drink() {
        drink++;
    }

}
