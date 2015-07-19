package week2.day2;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class Dragon {
    private String color;
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dragon(String color, int damage) {

    }

    public void fly(){
        System.out.println("I`m flying!");
    }
}
