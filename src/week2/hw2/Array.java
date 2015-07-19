package week2.hw2;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class Array {

    private int[] temp;
    private int min;
    private int max;

    public Array(int length) {
        temp = new int[length];
    }

    public void populateRandomValues() {
        for (int i = 0; i < temp.length; i++){
            temp[i] = (int) (Math.random() * 10);
        }
    }

    public void findMin() {

    }

    public void findMax() {

    }

    public void expandLengthTo(int lengthPlus) {

    }

    public void sortAsc() {

    }
}
