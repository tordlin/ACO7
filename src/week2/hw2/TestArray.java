package week2.hw2;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class TestArray {
    public static void main(String[] args) {
        Array arr = new Array(5);

        arr.populateRandomValues();

        arr.findMin();

        arr.findMax();

        arr.toString();

        arr.expandLengthTo(2);

        arr.sortAsc();

        Array arr2 = new Array(5);

        arr.populateRandomValues();

        arr.equals(arr2);
    }
}
