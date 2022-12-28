package com.tunayvaz.abstractfactory;

import com.tunayvaz.abstractfactory.factory.AbstractVehicleFactory;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * As a factory pattern allows us to create a generic factory of one or more than one type of object,
 * extending the same behavior, abstract factory design pattern allows us to create a factory of factories,
 * one level above the abstraction in the factory design pattern.
 *
 * This pattern separates the details of implementation of a set of objects
 * from their general usage and relies on object composition,
 * as object creation is implemented in methods exposed in the factory interface.
 * Client code works with factories and products only through their abstract interfaces.
 * This lets the client code work with any product variants, created by the factory object.
 */

@SpringBootApplication
@Log4j2
public class AbstractFactoryApplication implements Runnable {

    private final Car car = new Car();

    public static void main(String[] args) {
        var app = new AbstractFactoryApplication();
        app.run();
    }

    @Override
    public void run() {
        log.info("Creating family car.");

        buildCar(Car.FactoryMaker.CarType.FAMILY);
        log.info(car.getEngine().start());
        log.info(car.getTires().change());
        log.info(car.getTransmission().shiftUp());
        log.info(car.getTransmission().shiftDown());

        log.info("Creating racing car.");

        buildCar(Car.FactoryMaker.CarType.RACING);
        log.info(car.getEngine().start());
        log.info(car.getTires().change());
        log.info(car.getTransmission().shiftUp());
        log.info(car.getTransmission().shiftDown());
    }

    private void buildCar(Car.FactoryMaker.CarType carType) {
        final AbstractVehicleFactory vehicleFactory = Car.FactoryMaker.getFactory(carType);
        car.setTransmission(vehicleFactory.buildTransmission());
        car.setTires(vehicleFactory.createTires());
        car.setEngine(vehicleFactory.buildEngine());
    }
}
