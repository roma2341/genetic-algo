package com.zigzag.genetic.core.model;

import com.zigzag.genetic.libs.tree.BinaryTree;
import com.zigzag.genetic.libs.tree.api.Tree;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Chromosome {
    protected BinaryTree<GeneData> genes = new BinaryTree<>();
}
