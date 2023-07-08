package com.zigzag.genetic.pipes;

import com.zigzag.genetic.core.FitnessCalculator;
import com.zigzag.genetic.core.model.Chromosome;
import com.zigzag.genetic.core.model.GeneticContext;
import com.zigzag.genetic.pipes.api.GeneticPipe;

public class FitnessPipe implements GeneticPipe {

    FitnessCalculator fitnessCalculator = new FitnessCalculator();
    @Override
    public void execute(GeneticContext context) {
        context.getChromosomes().forEach(c -> {
            c.setFitness(fitnessCalculator.calculate(c));
        });
    }
}
