package com.zigzag.genetic.libs.tree.api;

public interface Tree<TREE_CLASS extends Tree<TREE_CLASS, VALUE_CLASS>, VALUE_CLASS> {
    TREE_CLASS getLeft();
    TREE_CLASS getRight();
    VALUE_CLASS getValue();
}
