package com.zigzag.genetic.libs.tree.api;

import com.zigzag.genetic.libs.tree.iterator.TreeChildIterator;

import java.util.Iterator;

public interface Tree<TREE_CLASS extends Tree<TREE_CLASS, VALUE_CLASS>, VALUE_CLASS> extends Iterable<TREE_CLASS> {
    TREE_CLASS getLeft();
    TREE_CLASS getRight();
    VALUE_CLASS getValue();

    default Iterator<TREE_CLASS> childIterator() {
        return new TreeChildIterator<VALUE_CLASS, TREE_CLASS>();
    }
}
