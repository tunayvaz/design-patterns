package com.tunayvaz.abstractfactory.factory;

import com.tunayvaz.abstractfactory.engine.ElectricEngine;
import com.tunayvaz.abstractfactory.engine.Engine;
import com.tunayvaz.abstractfactory.tires.RegularTires;
import com.tunayvaz.abstractfactory.tires.Tires;
import com.tunayvaz.abstractfactory.transmission.AutomaticTransmission;
import com.tunayvaz.abstractfactory.transmission.Transmission;

/**
 * Family car concrete object factory.
 */

public class FamilyCarFactory implements AbstractVehicleFactory {


    @Override
    public Transmission buildTransmission() {
        return new AutomaticTransmission();
    }

    @Override
    public Engine buildEngine() {
        return new ElectricEngine();
    }

    @Override
    public Tires createTires() {
        return new RegularTires();
    }
}
