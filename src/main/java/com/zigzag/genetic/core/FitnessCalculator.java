package com.zigzag.genetic.core;

import com.zigzag.genetic.core.model.Chromosome;
import com.zigzag.genetic.core.model.gene.IntegerGene;
import com.zigzag.genetic.libs.tree.BinaryTree;

import java.util.Iterator;

public class FitnessCalculator {
    public int calculate(Chromosome chromosome){
        int sum = 0;
        Iterator<BinaryTree<IntegerGene>> iterator = chromosome.genes().breadthFirstIterator();
        while(iterator.hasNext()){
            sum += iterator.next().value().allele();
        }
        return sum;
    }
}
