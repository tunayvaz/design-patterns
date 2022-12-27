package com.tunayvaz.singleton;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class SingletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingletonApplication.class, args);

        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        log.info("eagerInitialization1 = {}", eagerInitialization1);
        log.info("eagerInitialization2 = {}", eagerInitialization2);

        LazyInitializationThreadSafe lazyInitializationThreadSafe1 = LazyInitializationThreadSafe.getInstance();
        LazyInitializationThreadSafe lazyInitializationThreadSafe2 = LazyInitializationThreadSafe.getInstance();
        log.info("lazyInitializationThreadSafe1= {}", lazyInitializationThreadSafe1);
        log.info("lazyInitializationThreadSafe2= {}", lazyInitializationThreadSafe2);

        DoubleCheckThreadSafe doubleCheckThreadSafe1 = DoubleCheckThreadSafe.getInstance();
        DoubleCheckThreadSafe doubleCheckThreadSafe2 = DoubleCheckThreadSafe.getInstance();
        log.info("doubleCheckThreadSafe1= {}", doubleCheckThreadSafe1);
        log.info("doubleCheckThreadSafe2= {}", doubleCheckThreadSafe2);

        InitializingOnDemandHolderIdiom initializingOnDemandHolderIdiom1 = InitializingOnDemandHolderIdiom.getInstance();
        InitializingOnDemandHolderIdiom initializingOnDemandHolderIdiom2 = InitializingOnDemandHolderIdiom.getInstance();
        log.info("initializingOnDemandHolderIdiom1 = {}", initializingOnDemandHolderIdiom1);
        log.info("initializingOnDemandHolderIdiom2 = {}", initializingOnDemandHolderIdiom2);
    }
}
