package week4.duck;

/**
 * Created by Tordlin on 15/08/2015.
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly(){
        flyBehavior.fly();
    }
}
