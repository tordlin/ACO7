package week2.hw2;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class TestArray {
    public static void main(String[] args) {
        Array arr = new Array(5);

        arr.populateRandomValues();

        System.out.println(arr.toString());

        arr.findMin();

        arr.findMax();

        arr.expandLengthTo(2);

        System.out.println(arr.toString());

        arr.sortAsc();


        Array arr2 = new Array(5);

        arr2.populateRandomValues();

        System.out.println(arr2.toString());

        arr2.findMin();

        arr2.findMax();

        arr.equals(arr2);
    }
}
