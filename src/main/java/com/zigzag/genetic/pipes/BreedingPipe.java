package com.zigzag.genetic.pipes;

import com.zigzag.genetic.core.generator.ChromosomeBreeder;
import com.zigzag.genetic.core.model.GeneticContext;
import com.zigzag.genetic.pipes.api.GeneticPipe;

public class BreedingPipe implements GeneticPipe {

    ChromosomeBreeder chromosomeBreeder = new ChromosomeBreeder();
    @Override
    public void execute(GeneticContext context) {
        var howManyParentPairs = context.getConfig().getHowManyParentPairsInGeneration();
        var parents = context.getLimitedChromosomesListSortedByFitness(howManyParentPairs);
        for(int i = 0; i < parents.size(); i+=2){
            if(parents.size() - 1 == i){//1
                continue; //skip iteration if chromosome doesn't have a pair.
            }
            var mother = parents.get(i);
            var father = parents.get(i + 1);

            var childrenTuple = chromosomeBreeder.breed(mother,father);
            context.getChromosomes().add(childrenTuple.getFirst());
            context.getChromosomes().add(childrenTuple.getSecond());
        }
    }
}
