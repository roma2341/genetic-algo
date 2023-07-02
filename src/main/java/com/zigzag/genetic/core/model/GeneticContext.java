package com.zigzag.genetic.core.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class GeneticContext {
    protected GeneticConfig config = new GeneticConfig();
    protected Population population = new Population();

    public boolean hasNoPopulation(){
        return populationList.isEmpty();
    }
}
