package com.tunayvaz.facade;

import lombok.extern.log4j.Log4j2;

/**
 * Screen is one of the HomeTheatre subsystems.
 */
@Log4j2
public class Screen {

    public void turnOn() {
        log.info("Turning television screen on");
    }

    public void turnOff() {
        log.info("Turning television screen off");
    }
}
