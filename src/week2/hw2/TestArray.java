package week2.hw2;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class TestArray {
    public static void main(String[] args) {
        Array arr = new Array(5);

        arr.populateRandomValues();

        System.out.println(arr);

        System.out.println("Min is " + arr.findMin());

        System.out.println("Max is " + arr.findMax());

        arr.expandLengthTo(2);

        System.out.println(arr);

        arr.sortAsc();


        Array arr2 = new Array(5);

        arr2.populateRandomValues();

        System.out.println(arr2);

        System.out.println("Min is " + arr2.findMin());

        System.out.println("Max is " + arr2.findMax());

        System.out.println(arr.equals(arr2));
    }
}
