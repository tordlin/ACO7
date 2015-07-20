package week2.hw2;

/**
 * Created by Tordlin on 20/07/2015.
 */
public class Calculator {

    public void add(double firstValue, double secondValue){
        double showed = firstValue + secondValue;
        System.out.println(showed);
    }

    public void minus(double firstValue, double secondValue){
        double showed = firstValue - secondValue;
        System.out.println(showed);
    }

    public void multiple(double firstValue, double secondValue) {
        double showed = firstValue * secondValue;
        System.out.println(showed);
    }

    public void devide(double firstValue, double secondValue) {
        double showed = firstValue / secondValue;
        System.out.println(showed);
    }
}
