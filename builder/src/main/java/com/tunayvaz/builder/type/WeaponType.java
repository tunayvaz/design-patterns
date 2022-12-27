package com.tunayvaz.builder.type;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum WeaponType {

    SWORD("sword"),
    STAFF("staff");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
