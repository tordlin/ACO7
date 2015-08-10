package week4.hw4;

import java.util.Arrays;

/**
 * Created by Tordlin on 10/08/2015.
 */
public class ImpIList implements IList {
    private int size;
    Object[] listOfObject;


    public ImpIList(int size) {
        this.size = size;
        this.listOfObject = new Object[size];
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean add(Object obj) {
        Object[] newListOfObject = new Object[size + 1];
        for (int i = 0; i < listOfObject.length; i++) {
            newListOfObject[i] = listOfObject[i];
        }

        newListOfObject[size] = obj;

        listOfObject = newListOfObject;

        return true;
    }


    @Override
    public boolean add(Object obj, int index) {
        Object[] newListOfObject = new Object[size + 1];
        for (int i = 0; i < index; i++) {
            newListOfObject[i] = listOfObject[i];
        }

        for (int i = index; i < listOfObject.length; i++) {
            newListOfObject[index + 1] = listOfObject[i];
        }

        newListOfObject[index] = obj;

        listOfObject = newListOfObject;

        return true;
    }

    @Override
    public Object remove(Object obj) {
        for (int i = 0; i < listOfObject.length; i++) {
            if (listOfObject[i].equals(obj)) {

                int indexForDeleting = i;
                //this.remove(indexForDeleting);
                listOfObject[indexForDeleting] = null;

                for (int j = indexForDeleting; j < listOfObject.length - 1; j++) {
                    Object temp;
                    temp = listOfObject[j + 1];
                    listOfObject[j + 1] = listOfObject[j];
                    listOfObject[j] = temp;
                }
            }
        }
        return listOfObject;
    }

    @Override
    public Object remove(int index) {
        listOfObject[index] = null;

        for (int i = index; i < listOfObject.length - 1; i++) {
            Object temp;
            temp = listOfObject[i + 1];
            listOfObject[i + 1] = listOfObject[i];
            listOfObject[i] = temp;
        }
        return listOfObject;
    }

    @Override
    public Object get(int index) {
        return listOfObject[index];
    }

    @Override
    public boolean contains(Object obj) {
        for (Object o : listOfObject) {
            if (o.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ImpIList{" +
                "size=" + size +
                ", listOfObject=" + Arrays.toString(listOfObject) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImpIList impIList = (ImpIList) o;

        if (size != impIList.size) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(listOfObject, impIList.listOfObject);

    }

    @Override
    public int size() {
        return getSize();
    }
}
