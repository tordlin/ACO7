package week6.day1;

import week4.hw4.IList;

import java.util.Iterator;

/**
 * Created by Tordlin on 22/08/2015.
 */
public class MyLinkedList<T> implements IList {

    private  Node<T> head;
    private  Node<T> tail;
    private  int size;


    @Override
    public boolean add(Object obj) {
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
    public boolean add(Object obj, int index) {
        return false;
    }

    @Override
    public Object remove(Object obj) {
        return false;
    }


    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private static  class Node<E>{
        E elem;
        Node next;
        Node prev;

        public Node(E elem, Node next, Node prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }
}
