package com.zigzag.genetic.core.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class GeneticConfig {
    private int populationMaxSize = 100;
    private int howManyParentPairsInGeneration = 5;
}
