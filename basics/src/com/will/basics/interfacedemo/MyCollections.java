package com.will.basics.interfacedemo;

/**
 * @author Will
 * @date 16/5/18
 */
public interface MyCollections<E> {
    int size();

    boolean isEmpty();

    boolean contains(Object o);

    <T> T[] toArray(T[] a);
}
