package com.tunayvaz.facade;

import lombok.extern.log4j.Log4j2;

/**
 * PopcornPopper is one of the HomeTheatre subsystems.
 */
@Log4j2
public class PopcornPopper {

    public void pop() {
        log.info("Popping popcorn pop pop pop");
    }
}
