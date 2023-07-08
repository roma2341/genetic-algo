package com.zigzag.genetic.libs.tree.iterator;

import com.zigzag.genetic.libs.tree.api.Tree;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class TreeChildIterator<D, T extends Tree<T, D>> implements ListIterator<T> {

    protected Tree<T,D> tree;
    protected int cursor = 0;
    public TreeChildIterator(final Tree<T,D> tree){
        this.tree = requireNonNull(tree, "Tree must be not null");
    }
    @Override
    public boolean hasNext() {
        return cursor != tree.childCount();
    }

    @Override
    public T next() {
        int i = cursor;
        if(cursor >= tree.childCount()){
            throw new NoSuchElementException();
        }
        cursor++;
        return tree.childAt(i);
    }

    @Override
    public boolean hasPrevious() {
       return cursor != 0;
    }

    @Override
    public T previous() {
        int i = cursor - 1;
        if(i < 0){
            throw new NoSuchElementException();
        }
        cursor = i;
        return tree.childAt(i);
    }

    @Override
    public int nextIndex() {
        return cursor;
    }

    @Override
    public int previousIndex() {
        return cursor - 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(
                "Can't change Iterator size."
        );
    }

    @Override
    public void set(T t) {
        throw new UnsupportedOperationException(
                "Iterator is immutable."
        );
    }

    @Override
    public void add(T t) {
        throw new UnsupportedOperationException(
                "Can't change Iterator size."
        );
    }
}
