package week2.day2;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class IntNumber {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }

    public IntNumber(int value) {
        this.value = value;
    }

    public void add(IntNumber number){
        value = value + number.value;
        System.out.println(this.value);
    }

    public void minus(IntNumber number){
        value = value - number.value;
        System.out.println(this.value);
    }

    public void multiple(IntNumber number) {
        value = value * number.value;
        System.out.println(this.value);
    }

    public void devide(IntNumber number) {
        value = value / number.value;
        System.out.println(this.value);
    }
}
