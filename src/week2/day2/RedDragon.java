package week2.day2;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class RedDragon extends  Dragon{
    private int spitFire;

    public int getSpitFire() {
        return spitFire;
    }

    public void setSpitFire(int spitFire) {
        this.spitFire = spitFire;
    }

    public RedDragon(String color, int damage, int spitFire) {
        super(color, damage);
        this.spitFire = spitFire;
    }
    
    public void spitFire(){
        System.out.println("I`m spiting fire with " + spitFire + " damage");
    }
}
