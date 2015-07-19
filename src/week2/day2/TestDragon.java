package week2.day2;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class TestDragon {
    public static void main(String[] args) {
        Dragon simpleDragon = new Dragon("Green", 100);
        RedDragon redDragon = new RedDragon("Red", 100, 200);
        BlackDragon blackDragon = new BlackDragon("Black", 100, 300);

        simpleDragon.fly();
        redDragon.fly();
        redDragon.spitFire();
        blackDragon.fly();
        blackDragon.spitAcid();
    }
}
