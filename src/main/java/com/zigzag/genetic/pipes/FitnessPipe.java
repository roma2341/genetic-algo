package com.zigzag.genetic.pipes;

import com.zigzag.genetic.core.FitnessCalculator;
import com.zigzag.genetic.core.model.Chromosome;
import com.zigzag.genetic.core.model.GeneticContext;
import com.zigzag.genetic.pipes.api.GeneticPipe;

public class FitnessPipe implements GeneticPipe {

    FitnessCalculator fitnessCalculator = new FitnessCalculator();
    @Override
    public void execute(GeneticContext context) {
        int bestFitness = context.chromosomes().stream()
                .map(c -> {
                    c.fitness(fitnessCalculator.calculate(c));
                    return c.fitness();
                })
                .reduce(0, Math::max);
        context.bestFitness(bestFitness);
    }
}
