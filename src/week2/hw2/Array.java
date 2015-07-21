package week2.hw2;

/**
 * Created by Tordlin on 19/07/2015.
 */
public class Array {

    private int[] elements;


    public Array(int length) {
        elements = new int[length];
    }

    public void populateRandomValues() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = (int) (Math.random() * 10);
        }
    }

    public int findMin() {
        int min = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
        }
        return min;
    }

    public int findMax() {
        int max = elements[0];
            for (int i = 1; i < elements.length; i++) {
                if (elements[i] > max) {
                    max = elements[i];
                }
            }
        return max;
    }

    public void expandLengthTo(int lengthPlus) {
        int[] newTemp = new int[elements.length + lengthPlus];

        for (int i = 0; i < elements.length; i++) {
            newTemp[i] = elements[i];
        }

        elements = newTemp;
    }

    public void sortAsc() {
        int tmp;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    tmp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = tmp;
                }
            }
        }
    }


    public String toString() {
        String tmpShow = "{";
        for (int i = 0; i < elements.length - 1; i++) {
            tmpShow += Integer.toString(elements[i]) + " ";
        }
        tmpShow = "Array - " + tmpShow + Integer.toString(elements[elements.length - 1]) + "}";
        return tmpShow;
    }

    public boolean equals(Object arr) {
        if(this == arr) {
            return true;
        }

        if(arr == null) {
            return false;
        }

        if(!(arr instanceof Array)) {
            return false;
        }

        Array other = (Array) arr;

        return this.elements.length == other.elements.length;


        for (int i = 0; i < this.elements.length; i++) {
            if(this.elements[i] != other.elements.length){
                return false;
            }
        }
    }
}
