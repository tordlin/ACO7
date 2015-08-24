package week5.day2;

/**
 * Created by Tordlin on 16/08/2015.
 */
public interface ICollection<T>  extends Iterable<T>{
    boolean add(T t);
    void clear();
    boolean isEmpty();
    Object remove(T t);
    int size();
    boolean contains(T t);
}
