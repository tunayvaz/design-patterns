package com.tunayvaz.abstractfactory.factory;

import com.tunayvaz.abstractfactory.engine.Engine;
import com.tunayvaz.abstractfactory.tires.Tires;
import com.tunayvaz.abstractfactory.transmission.Transmission;
import com.tunayvaz.abstractfactory.TransmissionType;

public interface AbstractVehicleFactory {

    Transmission buildTransmission();
    Engine buildEngine();
    Tires createTires();
}
