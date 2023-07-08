package com.zigzag.genetic.core;

import com.zigzag.genetic.core.model.Chromosome;

public class FitnessCalculator {
    public int calculate(Chromosome chromosome){
        return chromosome.getGenes().getValue();
    }
}
