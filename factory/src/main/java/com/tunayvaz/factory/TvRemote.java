package com.tunayvaz.factory;

import lombok.extern.log4j.Log4j2;

/**
 * TV remote implementation
 */
@Log4j2
public class TvRemote implements Remote{

    @Override
    public void open(){
        log.info("Opening TV.");
    }
}
