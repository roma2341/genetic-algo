package com.zigzag.genetic.core.api;

public interface Self<S extends Self<S>> {

    /**
     * Return a reference of {@code this} object as the declared generic type
     * {@code S}.
     *
     * @return the {@code this} reference as the generic type {@code S}
     * @throws ClassCastException if the interface is not used as intended and
     *         {@code (this instanceof S) == false}
     */
    @SuppressWarnings("unchecked")
    default S self() {
        return (S)this;
    }

}
