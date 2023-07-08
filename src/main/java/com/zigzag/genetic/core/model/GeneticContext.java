package com.zigzag.genetic.core.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class GeneticContext {
    protected GeneticConfig config = new GeneticConfig();
    protected List<Chromosome> chromosomes;

    public boolean hasNoPopulation(){
        return chromosomes == null;
    }

    public List<Chromosome> getLimitedChromosomesListSortedByFitness(int maxItems){
        return chromosomes.stream()
                .sorted(Comparator.comparing(o -> o.getFitness()))
                .limit(maxItems)
                .collect(Collectors.toList());
    }
}
