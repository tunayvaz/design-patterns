package com.tunayvaz.factory;

import lombok.extern.log4j.Log4j2;

/**
 * Garage opener implementation
 */
@Log4j2
public class GarageOpenerRemote implements Remote {


    @Override
    public void open() {
        log.info("Opening garage door.");
    }
}
