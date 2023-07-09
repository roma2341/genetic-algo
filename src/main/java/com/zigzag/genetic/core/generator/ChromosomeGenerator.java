package com.zigzag.genetic.core.generator;

import com.zigzag.genetic.core.model.Chromosome;
import com.zigzag.genetic.core.model.GeneticContext;
import com.zigzag.genetic.core.model.gene.IntegerGene;
import com.zigzag.genetic.libs.tree.BinaryTree;

import java.util.List;

public class ChromosomeGenerator {
    public Chromosome generate(GeneticContext context){
        List<String> str = List.of();
        var leftSubTree =  BinaryTree.<IntegerGene>of().value(IntegerGene.of(10));
        var rightSubTree =  BinaryTree.<IntegerGene>of().value(IntegerGene.of(20));
        var chromosome = Chromosome.of();
                chromosome.genes()
                        .value(IntegerGene.of(10))
                        .left(leftSubTree)
                        .right(rightSubTree);
        return chromosome;
    }
}
