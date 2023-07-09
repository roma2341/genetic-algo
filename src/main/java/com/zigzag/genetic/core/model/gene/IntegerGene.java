package com.zigzag.genetic.core.model.gene;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
@AllArgsConstructor(staticName = "of")
public class IntegerGene implements Gene<Integer> {
    protected Integer allele;
}
