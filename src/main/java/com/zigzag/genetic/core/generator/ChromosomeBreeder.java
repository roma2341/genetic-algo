package com.zigzag.genetic.core.generator;

import com.zigzag.genetic.core.model.Chromosome;
import com.zigzag.genetic.libs.tuple.Tuple2;

public class ChromosomeBreeder {
    public Tuple2<Chromosome,Chromosome> breed(Chromosome mother, Chromosome father) {
        Chromosome child1 = _breedMotherRootAndLeftWithFatherRight(mother,father);
        Chromosome child2 = _breedMotherRootAndLeftWithFatherRight(father,mother);
        return Tuple2.of(child1,child2);
    }

    /***
     *      A1       A2
     *      |        |
     *     / \      / \
     *    B1  C1   B2  C2
     *
     *    Will produce
     *
     *      A1
     *      |
     *     / \
     *    B1  C2
     * @param mother
     * @param father
     * @return
     */
    protected Chromosome _breedMotherRootAndLeftWithFatherRight(Chromosome mother, Chromosome father) {
       var motherGenes = mother.genes();
       var fatherGenes = father.genes();
       var childGenes = motherGenes.copy();
       childGenes.right(fatherGenes.right());
       Chromosome childChromosome = new Chromosome();
       childChromosome.genes(childGenes);
       return childChromosome;
    }
}
