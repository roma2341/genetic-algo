package com.zigzag.genetic.core.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneticConfig {
    private int populationMaxSize = 100;
    private int howManyParentPairsInGeneration = 5;
}
