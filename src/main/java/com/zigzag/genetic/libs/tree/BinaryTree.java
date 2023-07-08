package com.zigzag.genetic.libs.tree;

import com.zigzag.genetic.libs.tree.api.Tree;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Iterator;
import java.util.Objects;

import static java.lang.String.format;

@Getter
@Setter
@Accessors(fluent = true)
public class BinaryTree<T> implements Tree<BinaryTree<T>, T> {
    protected BinaryTree<T> left;
    protected BinaryTree<T> right;
    protected T value;

    @Override
    public int childCount() {
        return 0;
    }

    @Override
    public BinaryTree<T> childAt(int index) {
        switch (index){
            case 0:
                return left;
            case 1:
                return right;
            default:
                throw indexError(index);
        }
    }

    @Override
    public BinaryTree<T> copy() {
        var copy = new BinaryTree<T>();
        if(left != null){
            copy.left = left.copy();
        }
        if(right != null){
            copy.right = right.copy();
        }
        copy.value = value;
        return copy;
    }

    @Override
    public Iterator<BinaryTree<T>> iterator() {
        return childIterator();
    }

    private static ArrayIndexOutOfBoundsException indexError(final int index) {
        return new ArrayIndexOutOfBoundsException(format(
                "Child index is out of bounds: %s", index
        ));
    }
}
