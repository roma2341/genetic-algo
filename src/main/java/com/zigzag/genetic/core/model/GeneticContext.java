package com.zigzag.genetic.core.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Accessors(fluent = true)
public class GeneticContext {
    protected GeneticConfig config = new GeneticConfig();
    protected List<Chromosome> chromosomes;
    protected int currentGeneration = 0;
    protected int bestFitness = 0;

    public boolean hasNoPopulation(){
        return chromosomes == null;
    }

    public List<Chromosome> getLimitedChromosomesListSortedByFitness(int maxItems){
        return chromosomes.stream()
                .sorted(Comparator.comparing(o -> o.fitness()))
                .limit(maxItems)
                .collect(Collectors.toList());
    }
}
