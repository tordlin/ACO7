package week4.hw4;

import week5.day2.ICollection;

/**
 * Created by Tordlin on 10/08/2015.
 */
public interface IList<T> extends  ICollection<T>{
    boolean add(T obj);

    boolean add(T obj, int index);

    Object remove(Object obj);

    Object remove(int index);

    Object get(int index);

    boolean contains(Object obj);

    int size();
}
