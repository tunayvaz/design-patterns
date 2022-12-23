package com.tunayvaz.factory;

/**
 * Factory of remote controllers.
 */
public class RemoteFactory {

    /**
     *
     * @param type Type of the remote controller that clients wants to create.
     * @return A remote controller, depending on the provided type.
     */
    public static Remote getRemote(RemoteType type){
        return type.getConstructor().get();
    }
}
