package com.zigzag.genetic.pipes;

import com.zigzag.genetic.core.generator.ChromosomeGenerator;
import com.zigzag.genetic.core.model.Chromosome;
import com.zigzag.genetic.core.model.GeneticContext;
import com.zigzag.genetic.pipes.api.GeneticPipe;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GeneratePopulationPipe implements GeneticPipe {

    protected ChromosomeGenerator chromosomeGenerator = new ChromosomeGenerator();
    public void execute(GeneticContext context) {
        var config = context.config();
        List<Chromosome> chromosomes = new ArrayList<>(config.populationMaxSize());
        for(int i = 0; i < config.populationMaxSize(); i++){
            chromosomes.add(
                    chromosomeGenerator.generate(context)
            );
        }
        context.chromosomes(chromosomes);
    }
}
