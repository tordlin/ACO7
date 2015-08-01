package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class Juggler extends Employee{

    public Juggler(String name) {
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("Juggling!");
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
