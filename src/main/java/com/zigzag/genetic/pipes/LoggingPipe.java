package com.zigzag.genetic.pipes;

import com.zigzag.genetic.core.model.GeneticContext;
import com.zigzag.genetic.pipes.api.GeneticPipe;

import static java.lang.String.format;

public class LoggingPipe implements GeneticPipe {
    @Override
    public void execute(GeneticContext context) {
        System.out.println(
                format(
                        """
                                Generation:%d \n
                                Best fitness:%d \n
                                Population size:%d
                                """,
                        context.currentGeneration(),
                        context.bestFitness(),
                        context.populationSize()));
    }
}
