package com.tunayvaz.facade;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
