package com.zigzag.genetic.pipes;

import com.zigzag.genetic.core.model.GeneticContext;
import com.zigzag.genetic.pipes.api.GeneticPipe;

public class CrossingPipe implements GeneticPipe {
    @Override
    public void execute(GeneticContext context) {
        System.out.println("Execution skipped");
    }
}
