package com.zigzag.genetic.pipes;

import com.zigzag.genetic.core.model.Chromosome;
import com.zigzag.genetic.core.model.GeneticContext;
import com.zigzag.genetic.pipes.api.GeneticPipe;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RepopulationPipe implements GeneticPipe {
    @Override
    public void execute(GeneticContext context) {
        var maxPopulationSize = context.config().populationMaxSize();
        List<Chromosome> chromosomes = context.chromosomes();
        var newGenerationChromosomes = context.getLimitedChromosomesListSortedByFitness(maxPopulationSize);
        var stayAliveChromosomes =  chromosomes.stream().limit(maxPopulationSize).collect(Collectors.toList());
        context.chromosomes(stayAliveChromosomes);
    }
}
