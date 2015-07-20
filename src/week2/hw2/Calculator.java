package week2.hw2;

/**
 * Created by Tordlin on 20/07/2015.
 */
public class Calculator {
    private double value;

    public void setValue(double value) {

        this.value = value;
    }

    public void add(double doubleValue){
        value = value + doubleValue;
        System.out.println(this.value);
    }

    public void minus(double doubleValue){
        value = value - doubleValue;
        System.out.println(this.value);
    }

    public void multiple(double doubleValue) {
        value = value * doubleValue;
        System.out.println(this.value);
    }

    public void devide(double doubleValue) {
        value = value / doubleValue;
        System.out.println(this.value);
    }
}
