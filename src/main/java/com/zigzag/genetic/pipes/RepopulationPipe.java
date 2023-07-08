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
        var maxPopulationSize = context.getConfig().getPopulationMaxSize();
        List<Chromosome> chromosomes = context.getChromosomes();
        int maxChromosomesStatyingAlive = maxPopulationSize * howManyChromosomesStayAliveForNextPopulation;
        var newGenerationChromosomes = context.getLimitedChromosomesListSortedByFitness(maxChromosomesStatyingAlive);
        while(newGenerationChromosomes.size() < howManyChromosomesStayAliveForNextPopulation) {
            newGenerationChromosomes.add(new Chromosome());
        }

    }
}
