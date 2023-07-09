package com.zigzag.genetic.core;

import com.zigzag.genetic.core.model.GeneticContext;
import com.zigzag.genetic.pipes.*;

public class AlgoManager {
    private GeneticContext context = new GeneticContext();
    private GeneratePopulationPipe generatePopulationPipe = new GeneratePopulationPipe();
    private FitnessPipe fitnessPipe = new FitnessPipe();
    private RepopulationPipe repopulationPipe = new RepopulationPipe();
    private BreedingPipe breedingPipe = new BreedingPipe();
    private LoggingPipe loggingPipe = new LoggingPipe();

    public void nextGeneration(){
        // 1. Init initial population
        if(context.hasNoPopulation()){
            generatePopulationPipe.execute(context);
            return;
        }
        // 2. Calculate fitness
        // 3.1. Pick best populations
        // 3.2  Produce children
        fitnessPipe.execute(context);
        breedingPipe.execute(context);
        repopulationPipe.execute(context);
        fitnessPipe.execute(context);
        loggingPipe.execute(context);
        context.incrementGeneration();
    }
}
