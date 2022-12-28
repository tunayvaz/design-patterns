package com.tunayvaz.abstractfactory.tires;

/**
 * Performance tires implementation.
 */

public class PerformanceTires implements Tires {

    private static final String DESCRIPTION = "Racing team is changing the tires.";

    @Override
    public String change() {
        return DESCRIPTION;
    }
}
