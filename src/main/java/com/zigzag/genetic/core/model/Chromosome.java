package com.zigzag.genetic.core.model;

import com.zigzag.genetic.core.api.Verifiable;
import com.zigzag.genetic.libs.tree.BinaryTree;
import com.zigzag.genetic.libs.tree.api.Tree;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Chromosome implements Verifiable {
    protected BinaryTree<GeneData> genes = new BinaryTree<>();
    protected int fitness = 0;

    @Override
    public boolean isValid() {
        return true;
    }
}
