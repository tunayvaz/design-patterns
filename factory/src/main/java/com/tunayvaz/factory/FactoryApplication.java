package com.tunayvaz.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryApplication.class, args);

        Remote remote1 = RemoteFactory.getRemote(RemoteType.AC_REMOTE);
        Remote remote2 = RemoteFactory.getRemote(RemoteType.GARAGE_OPENER);
        Remote remote3 = RemoteFactory.getRemote(RemoteType.TV_REMOTE);

        remote1.open();
        remote2.open();
        remote3.open();
    }

}
