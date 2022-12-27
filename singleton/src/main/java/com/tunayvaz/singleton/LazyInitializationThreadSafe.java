package com.tunayvaz.singleton;

/**
 * Despite this class being thread-safe, we can see that there's a serious performance drawback:
 * Each time we want to get the instance of our singleton, we need to acquire a potentially unnecessary lock.
 */
public final class LazyInitializationThreadSafe {

    private static volatile LazyInitializationThreadSafe LOGGER;

    /**
     * Private constructor prevents instantiation, unless using the getInstance() method.
     */
    private LazyInitializationThreadSafe() {
        if (LOGGER != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }


    public static synchronized LazyInitializationThreadSafe getInstance() {
        if (LOGGER == null) {
            synchronized (LazyInitializationThreadSafe.class) {
                if (LOGGER == null) {
                    LOGGER = new LazyInitializationThreadSafe();
                }
            }
        }
        return LOGGER;
    }
}
