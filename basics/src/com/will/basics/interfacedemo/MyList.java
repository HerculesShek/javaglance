package com.will.basics.interfacedemo;

/**
 * @author Will
 * @date 16/5/18
 */
public interface MyList<E> extends MyCollections<E> {
    int size();

    boolean isEmpty();

    boolean contains(Object o);

    <T> T[] toArray(T[] a);

    E get(int index);

    int indexOf(Object o);

}
