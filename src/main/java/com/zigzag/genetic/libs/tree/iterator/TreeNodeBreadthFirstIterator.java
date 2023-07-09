package com.zigzag.genetic.libs.tree.iterator;

import com.zigzag.genetic.libs.tree.api.Tree;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class TreeNodeBreadthFirstIterator<V, T extends Tree<T, V>> implements Iterator<T> {
    ArrayDeque<T> queue = new ArrayDeque<>();

    public TreeNodeBreadthFirstIterator(T tree){
        requireNonNull(tree, "Tree must be not nulll");
        queue.add(tree);
    }
    @Override
    public boolean hasNext() {
       return !queue.isEmpty();
    }

    @Override
    public T next() {
        T nextElement = queue.pollFirst();
        var childIterator = nextElement.childIterator();
        while(childIterator.hasNext()){
         queue.add(childIterator.next());
        }
        return nextElement;
    }
}
