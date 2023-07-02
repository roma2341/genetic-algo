package com.zigzag.genetic.core;

import com.zigzag.genetic.core.model.GeneticContext;
import com.zigzag.genetic.core.model.Population;
import com.zigzag.genetic.pipes.FitnessPipe;
import com.zigzag.genetic.pipes.GeneratePopulationPipe;
import com.zigzag.genetic.pipes.RepopulationPipe;

import java.util.List;

public class AlgoManager {
    private GeneticContext context = new GeneticContext();
    private GeneratePopulationPipe generatePopulationPipe = new GeneratePopulationPipe();
    private FitnessPipe fitnessPipe = new FitnessPipe();
    private RepopulationPipe repopulationPipe = new RepopulationPipe();

    public void nextGeneration(){
        // 1. Init initial population
        if(context.hasNoPopulations()){
            generatePopulationPipe.execute(context);
            return;
        }
        // 2. Calculate fitness
        // 3.1. Pick best populations
        // 3.2  Produce children
        fitnessPipe.execute(context);
        repopulationPipe.execute(context);
    }
}
