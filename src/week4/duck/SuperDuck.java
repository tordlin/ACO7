package week4.duck;

/**
 * Created by Tordlin on 15/08/2015.
 */
public class SuperDuck extends Duck{
    public SuperDuck() {
        super(new SuperFlyBehavior());
    }
}
