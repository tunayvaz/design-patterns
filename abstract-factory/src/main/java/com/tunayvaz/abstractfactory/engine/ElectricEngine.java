package com.tunayvaz.abstractfactory.engine;

/**
 * Electric engine implementation.
 */

public class ElectricEngine implements Engine {

    private static final String START = "Starting electric engine to go to a family picnic.";

    @Override
    public String start() {
        return START;
    }
}
