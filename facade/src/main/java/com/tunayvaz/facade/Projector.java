package com.tunayvaz.facade;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Projector {

    public void turnOn() {
        log.info("Opening projector");
    }

    public void turnOff() {
        log.info("Closing projector");
    }
}
