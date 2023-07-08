package com.zigzag.genetic.libs.tree.iterator;

import com.zigzag.genetic.libs.tree.api.Tree;

import java.util.ListIterator;

public class TreeChildIterator<D, T extends Tree<T, D>> implements ListIterator<T> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public T previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(T t) {

    }

    @Override
    public void add(T t) {

    }
}
