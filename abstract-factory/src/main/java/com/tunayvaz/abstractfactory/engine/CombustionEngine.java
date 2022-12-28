package com.tunayvaz.abstractfactory.engine;

/**
 * Combustion engine implementation.
 */

public class CombustionEngine implements Engine {

    private static final String START = "Starting combustion engine for the race vroom vroooom.";

    @Override
    public String start() {
        return START;
    }
}
