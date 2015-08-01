package week3.hw3;

/**
 * Created by Tordlin on 29/07/2015.
 */
public class Clown extends Employee{

    public Clown(String name) {
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("Very funny!");
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
