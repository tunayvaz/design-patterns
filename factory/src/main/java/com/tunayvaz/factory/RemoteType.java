package com.tunayvaz.factory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/**
 * Enumeration for available, creatable types of remotes.
 */
@Getter
@RequiredArgsConstructor
public enum RemoteType {

    GARAGE_OPENER(GarageOpenerRemote::new),
    TV_REMOTE(TvRemote::new),
    AC_REMOTE(AirConditionerRemote::new);

    private final Supplier<Remote> constructor;
}
