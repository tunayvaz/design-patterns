package com.tunayvaz.facade;

import lombok.extern.log4j.Log4j2;

/**
 * Lights is one of the HomeTheatre subsystems.
 */

@Log4j2
public class Lights {

    public void dim(int percent) {
        log.info("Dimming lights to {}", percent);
    }

    public void brighten(int percent) {
        log.info("Brightening lights back");
    }
}
