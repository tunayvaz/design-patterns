package com.tunayvaz.builder.type;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ArmorType {

    FABRIC("fabric armor"),
    CHAINMAIL("chainmail armor"),
    FULL_PLATE("full plate armor");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
