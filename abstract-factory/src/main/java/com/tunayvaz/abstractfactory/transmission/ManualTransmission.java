package com.tunayvaz.abstractfactory.transmission;

/**
 * Manual transmission implementation.
 */

public class ManualTransmission implements Transmission {

    private static final String SHIFT_UP = "Racer is shifting gear up manually.";
    private static final String SHIFT_DOWN = "Racer is shifting gear down manually.";
    @Override
    public String shiftUp() {
        return SHIFT_UP;
    }

    @Override
    public String shiftDown() {
        return SHIFT_DOWN;
    }
}
