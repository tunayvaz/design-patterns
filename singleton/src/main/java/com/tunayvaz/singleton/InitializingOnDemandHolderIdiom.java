package com.tunayvaz.singleton;


/**
 * The inner class is referenced no earlier, so it will be loaded no earlier by the class loader
 * than the moment that getInstance() is called. Thus, this solution is thread-safe without
 * requiring any special language constructs such as volatile or synchronized keywords since the
 * class initialization is guaranteed to be a non-concurrent operation by Java Language Specification.
 * <p>
 * This method is the fastest way to instantiate a singleton by far. But to take note,
 * this can only be used when the construction of InitializingOnDemandHolderIdiom class is guaranteed to not fail.
 * If construction of InitializingOnDemandHolderIdiom class fails, subsequent attempts to initialize it
 * from the same class-loader will result in a NoClassDefFoundError failure.
 */
public final class InitializingOnDemandHolderIdiom {

    /**
     * Private constructor prevents instantiation, unless using the getInstance() method.
     */
    private InitializingOnDemandHolderIdiom() {
    }

    public static InitializingOnDemandHolderIdiom getInstance() {
        return InstanceHolder.INSTANCE;
    }

    /**
     * Provides the lazy-loaded Singleton instance.
     */
    private static class InstanceHolder {
        private static final InitializingOnDemandHolderIdiom INSTANCE =
                new InitializingOnDemandHolderIdiom();
    }
}
