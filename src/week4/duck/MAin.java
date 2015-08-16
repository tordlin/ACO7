package week4.duck;

/**
 * Created by Tordlin on 15/08/2015.
 */
public class MAin {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck superDuck = new SuperDuck();

        mallard.fly();
        superDuck.fly();
    }
}
