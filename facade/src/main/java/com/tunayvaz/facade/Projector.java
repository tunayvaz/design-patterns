package com.tunayvaz.facade;

import lombok.extern.log4j.Log4j2;

/**
 * Projector is one of the HomeTheatre subsystems.
 */
@Log4j2
public class Projector {

    public void turnOn() {
        log.info("Opening projector");
    }

    public void turnOff() {
        log.info("Closing projector");
    }
}
