package com.tunayvaz.singleton;

/**
 * Eagerly initialized static instance guarantees thread safety since JVM loads classes as a sequential operation.
 * Downside of this is that you will have to give up the control of instantiation moment.
 */

public final class EagerInitialization {

    /**
     * Private constructor prevents instantiation, unless using the getInstance() method.
     */
    private EagerInitialization() {
    }

    private static final EagerInitialization LOGGER = new EagerInitialization();

    public static EagerInitialization getInstance() {
        return LOGGER;
    }
}
