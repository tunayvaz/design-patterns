package com.tunayvaz.facade;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Screen {

    public void turnOn() {
        log.info("Turning television screen on");
    }

    public void turnOff() {
        log.info("Turning television screen off");
    }
}
