package com.tunayvaz.abstractfactory.factory;

import com.tunayvaz.abstractfactory.engine.CombustionEngine;
import com.tunayvaz.abstractfactory.engine.Engine;
import com.tunayvaz.abstractfactory.tires.PerformanceTires;
import com.tunayvaz.abstractfactory.tires.Tires;
import com.tunayvaz.abstractfactory.transmission.ManualTransmission;
import com.tunayvaz.abstractfactory.transmission.Transmission;

/**
 * Racing car concrete object factory.
 */

public class RacingCarFactory implements AbstractVehicleFactory {


    @Override
    public Transmission buildTransmission() {
        return new ManualTransmission();
    }

    @Override
    public Engine buildEngine() {
        return new CombustionEngine();
    }

    @Override
    public Tires createTires() {
        return new PerformanceTires();
    }
}
