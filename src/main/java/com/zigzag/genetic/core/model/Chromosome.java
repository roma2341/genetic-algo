package com.zigzag.genetic.core.model;

import com.zigzag.genetic.core.api.Verifiable;
import com.zigzag.genetic.core.model.gene.Gene;
import com.zigzag.genetic.core.model.gene.IntegerGene;
import com.zigzag.genetic.libs.tree.BinaryTree;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
@NoArgsConstructor(staticName = "of")
public class Chromosome implements Verifiable {
    protected BinaryTree<IntegerGene> genes = BinaryTree.of();
    protected int fitness = 0;

    @Override
    public boolean isValid() {
        return true;
    }
}
