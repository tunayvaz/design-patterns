package com.tunayvaz.abstractfactory;

import com.tunayvaz.abstractfactory.engine.Engine;
import com.tunayvaz.abstractfactory.factory.AbstractVehicleFactory;
import com.tunayvaz.abstractfactory.factory.FamilyCarFactory;
import com.tunayvaz.abstractfactory.factory.RacingCarFactory;
import com.tunayvaz.abstractfactory.tires.Tires;
import com.tunayvaz.abstractfactory.transmission.Transmission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private Engine engine;
    private Transmission transmission;
    private Tires tires;

    /**
     * The factory of car factories.
     */
    public static class FactoryMaker {

        /**
         * Enumeration for the different types of cars.
         */
        public enum CarType {FAMILY, RACING}

        /**
         * The factory method to create CarFactory concrete objects. The factory of factories.
         */
        public static AbstractVehicleFactory getFactory(CarType type) {
            return switch (type) {
                case FAMILY -> new FamilyCarFactory();
                case RACING -> new RacingCarFactory();
            };
        }

    }

}
