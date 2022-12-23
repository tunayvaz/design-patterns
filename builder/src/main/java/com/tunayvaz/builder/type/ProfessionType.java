package com.tunayvaz.builder.type;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ProfessionType {

    SOLDIER("soldier"),
    MAGE("mage");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
