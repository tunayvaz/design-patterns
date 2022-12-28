package com.tunayvaz.facade;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Facade Pattern provides a unified interface to a set of interfaces in a subsystem.
 * Facade defines a higher-level interface that makes the subsystem easier to use.
 * This pattern hides the complexities of the larger system and provides a simpler
 * interface to the client. It typically involves a single wrapper class which contains a set of
 * members required by client. These members access the system on behalf of the facade client and
 * hide the implementation details. It’s especially handy when working with complex libraries and APIs.
 * The Lights, PopcornPopper, Projector, Screen, Speaker and VideoPlayer
 * are the subsystems required for the home theatre system to work.
 */

@SpringBootApplication
@Log4j2
public class FacadeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacadeApplication.class, args);

        HomeTheatreFacade facade = new HomeTheatreFacade("Netflix");
        facade.watchSeries("The Sopranos");
        log.info("Series ended.");
        facade.close();
    }
}
