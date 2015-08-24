package week4.hw4;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Tordlin on 10/08/2015.
 */
public class ImpIList<T> implements IList<T> {
    private int index = 0;
    private T[] listOfObject;


    public ImpIList(int size) {
//        this.listOfObject = new T[size];
    }

    public int getSize() {
        return index;
    }

    @Override
    public boolean add(T obj) {
        ensureCapacity();

        listOfObject[index++] = obj;

        return true;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    private void ensureCapacity() {

        if (listOfObject.length <= index) {
            //Object[] newListOfObject = new Object[index * 2];
            Arrays.copyOf(listOfObject, index * 2);
            /*for (int j = 0; j < listOfObject.length; j++) {
                newListOfObject[j] = listOfObject[j];
            }*/
            //listOfObject = newListOfObject;
        }
    }


    @Override
    public boolean add(T obj, int index) {
        ensureCapacity();

        Object temp;

        for (int i = listOfObject.length - 1; i > index; i--) {
            listOfObject[i] = listOfObject[i - 1];
        }

        listOfObject[index++] = obj;

        return true;
    }

    @Override
    public Object remove(Object obj) {
        for (int i = 0; i < listOfObject.length; i++) {
            if (listOfObject[i].equals(obj)) {

                int indexForDeleting = i;
                this.remove(indexForDeleting);
                listOfObject[indexForDeleting] = null;

                for (int j = indexForDeleting; j < listOfObject.length - 1; j++) {
                    T temp;
                    temp = listOfObject[j + 1];
                    listOfObject[j + 1] = listOfObject[j];
                    listOfObject[j] = temp;
                }

            }
        }
        return obj;
    }

    @Override
    public Object remove(int index) {
        Object returning = listOfObject[index];
        listOfObject[index] = null;

        for (int i = index; i < listOfObject.length - 1; i++) {
            T temp;
            temp = listOfObject[i + 1];
            listOfObject[i + 1] = listOfObject[i];
            listOfObject[i] = temp;
        }
        return returning;
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
        return "size = " + (index) +
                ", listOfObject=" + Arrays.toString(listOfObject) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImpIList impIList = (ImpIList) o;

        if (index != impIList.index) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(listOfObject, impIList.listOfObject);

    }

    @Override
    public int size() {
        return getSize();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
