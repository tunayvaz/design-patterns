package com.tunayvaz.abstractfactory.transmission;

/**
 * Automatic transmission implementation.
 */

public class AutomaticTransmission implements Transmission {

    private static final String SHIFT_UP = "Transmission system is shifting gear up automatically.";
    private static final String SHIFT_DOWN = "Transmission system is shifting gear down automatically.";

    @Override
    public String shiftUp() {
        return SHIFT_DOWN;
    }

    @Override
    public String  shiftDown() {
        return SHIFT_UP;
    }
}
