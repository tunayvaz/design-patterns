package com.tunayvaz.singleton;

/**
 * To fix the performance problem we've come across with LazyInitializationThreadSafeLogger,
 * DoubleCheckThreadSafeLogger instead starts by verifying if we need to create the object in the first place
 * and only in that case it acquires the lock.
 */
public final class DoubleCheckThreadSafe {

    private static volatile DoubleCheckThreadSafe LOGGER;

    /**
     * Private constructor prevents instantiation, unless using the getInstance() method.
     */
    private DoubleCheckThreadSafe() {

        if (LOGGER != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static DoubleCheckThreadSafe getInstance() {

        DoubleCheckThreadSafe instance = LOGGER;
        // check if singleton instance is initialized.
        // if so, return the already initialized instance.
        if (instance == null) {
            // it is not initialized in this thread but some other thread
            // might have initialized it in the meanwhile.
            // to make sure that some other thread didn't initialize we need to lock on.
            synchronized (DoubleCheckThreadSafe.class) {
                // again assign the instance to local variable to see if
                // our singleton was initialized by some other thread
                // while this thread was blocked by the locked zone.
                instance = LOGGER;
                if (instance == null) {
                    // we are sure that neither this nor any other thread has initialized a singleton instance
                    // so create a new instance and return.
                    instance = LOGGER = new DoubleCheckThreadSafe();
                }
            }
        }
        return instance;
    }
}