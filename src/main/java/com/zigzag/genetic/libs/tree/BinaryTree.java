package com.zigzag.genetic.libs.tree;

import com.zigzag.genetic.libs.tree.api.Tree;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BinaryTree<T> implements Tree<BinaryTree<T>, T> {
    protected BinaryTree<T> left;
    protected BinaryTree<T> right;
    protected T value;
}
