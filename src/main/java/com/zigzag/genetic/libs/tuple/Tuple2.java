package com.zigzag.genetic.libs.tuple;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tuple2<T,D> {
    T first;
    D second;
    protected Tuple2(T first, D second){
        this.first = first;
        this.second = second;
    }
    public static <T,D> Tuple2<T,D> of(T first, D second) {
        return new Tuple2<>(first,second);
    }

}
