package com.tunayvaz.builder.type;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum HairType {

    SHORT("short"),
    CURLY("curly"),
    LONG_STRAIGHT("long straight");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
