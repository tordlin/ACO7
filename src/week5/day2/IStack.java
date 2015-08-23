package week5.day2;

/**
 * Created by Tordlin on 16/08/2015.
 */
public interface IStack<T> extends ICollection<T>{
    T push(T t);
    T pop();
    T peek();
}
