package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class AcroJuggler extends Acrobat{


    public AcroJuggler(String name) {
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("Acrobatic juggling!");
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
