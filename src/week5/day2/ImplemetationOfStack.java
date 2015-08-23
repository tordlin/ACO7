package week5.day2;

import java.util.Arrays;

/**
 * Created by Tordlin on 16/08/2015.
 */
public class ImplemetationOfStack<T> implements IStack<T> {
    T[] listOfT = (T[]) new Object[10];
    private int index = 0;

    private void ensureCapacity() {
        if (listOfT.length <= index) {
            Arrays.copyOf(listOfT, index * 2);
        }
    }

    @Override
    public T push(T t) {
        ensureCapacity();
        listOfT[index++] = t;
        return t;
    }

    @Override
    public T pop() {
        T returned = listOfT[index - 1];
        listOfT[index - 1] = null;
        index--;
        return returned;
    }

    @Override
    public T peek() {
        T returned = listOfT[index - 1];
        return returned;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }
}
