package week2.hw2;

import java.util.Arrays;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class Array {

    private int[] temp;


    public Array(int length) {
        temp = new int[length];
    }

    public void populateRandomValues() {
        for (int i = 0; i < temp.length; i++){
            temp[i] = (int) (Math.random() * 10);
        }
    }

    public void findMin() {
        int min = temp[0];
        if(temp.length > 0){
            for (int i = 1; i < temp.length; i++) {
                if(temp[i] < min){
                    min = temp[i];
                }
            }
        }
        System.out.println("Minimum is " + min);
    }

    public void findMax() {
        int max = temp[0];
        if(temp.length > 0){
            for (int i = 1; i < temp.length; i++) {
                if(temp[i] > max){
                    max = temp[i];
                }
            }
        }
        System.out.println("Maximum is " + max);
    }

    public void expandLengthTo(int lengthPlus) {
        int[] newTemp = new int[temp.length + lengthPlus];

        for (int i = 0; i < temp.length; i++) {
            newTemp[i] = temp[i];
        }

        temp = newTemp;
    }

    public void sortAsc() {
        int tmp;
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - 1; j++) {
                if(temp[j] > temp[j + 1]){
                    tmp = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = tmp;
                }
            }
        }
    }


    public String toString() {
        String tmpShow = "{";
        String tmp = "";
        for (int i = 0; i <temp.length - 1; i++) {
            tmp += Integer.toString(temp[i]) + " ";
        }
        tmpShow = "Array - " + tmpShow + tmp + Integer.toString(temp[temp.length - 1]) + "}";
        return tmpShow;
    }

    public boolean equals(Array arr){

    }
}
