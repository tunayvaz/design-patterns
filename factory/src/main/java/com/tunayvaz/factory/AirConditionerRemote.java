package com.tunayvaz.factory;

import lombok.extern.log4j.Log4j2;

/**
 * Air conditioner remote implementation
 */
@Log4j2
public class AirConditionerRemote implements Remote {

    @Override
    public void open() {
        log.info("Opening air conditioner.");
    }
}
