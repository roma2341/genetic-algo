package com.zigzag.genetic.libs.tree.api;

import com.zigzag.genetic.core.api.Self;
import com.zigzag.genetic.libs.tree.iterator.TreeChildIterator;
import com.zigzag.genetic.libs.tree.iterator.TreeNodeBreadthFirstIterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface Tree<TREE_CLASS extends Tree<TREE_CLASS, VALUE_CLASS>, VALUE_CLASS> extends Iterable<TREE_CLASS>, Self<TREE_CLASS> {
    VALUE_CLASS value();
    int childCount();
    TREE_CLASS childAt(int index);

    default Iterator<TREE_CLASS> childIterator() {
        return new TreeChildIterator<>(self());
    }
    default Iterator<TREE_CLASS> breadthFirstIterator() {
        return new TreeNodeBreadthFirstIterator<>(self());
    }

    /**
     * Return a forward-order stream of this node's children.
     *
     * @return a stream of children of {@code this} node
     */
    default Stream<TREE_CLASS> childStream() {
        return StreamSupport.stream(
                Spliterators.spliterator(
                        childIterator(),
                        childCount(),
                        Spliterator.SIZED | Spliterator.ORDERED
                ),
                false
        );
    }
    TREE_CLASS copy();
}
