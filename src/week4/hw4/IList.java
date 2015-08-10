package week4.hw4;

/**
 * Created by Tordlin on 10/08/2015.
 */
public interface IList {
    boolean add(Object obj);

    boolean add(Object obj, int index);

    Object remove(Object obj);

    Object remove(int index);

    Object get(int index);

    boolean contains(Object obj);

    int size();
}
