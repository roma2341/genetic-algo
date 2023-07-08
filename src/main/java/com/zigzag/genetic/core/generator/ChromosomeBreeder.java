package com.zigzag.genetic.core.generator;

import com.zigzag.genetic.core.model.Chromosome;
import com.zigzag.genetic.libs.tuple.Tuple2;

public class ChromosomeBreeder {
    public Tuple2<Chromosome,Chromosome> breed(Chromosome mother, Chromosome father) {
        Chromosome child1 = new Chromosome();
        Chromosome child2 = new Chromosome();
        return Tuple2.of(child1,child2);
    }

    protected _breedLeft(Chromosome mother, Chromosome father) {
       var motherGenes = mother.getGenes();
       var fatherGenes = father.getGenes();
       motherGenes.
    }
}
