package com.tunayvaz.abstractfactory.tires;

/**
 * Regular tires implementation.
 */

public class RegularTires implements Tires {

    private static final String DESCRIPTION = "Owner himself is changing tires.";
    @Override
    public String change() {
        return DESCRIPTION;
    }
}
