package week2.day2;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class BlackDragon extends Dragon {
    private int spitAcid;

    public BlackDragon(String color, int damage, int spitAcid) {
        super(color, damage);
        this.spitAcid = spitAcid;
    }

    public int getSpitAcid() {
        return spitAcid;
    }

    public void setSpitAcid(int spitAcid) {
        this.spitAcid = spitAcid;
    }

    public void spitAcid(){
        System.out.println("I`m spiting acid with " + spitAcid + " damage");
    }
}
