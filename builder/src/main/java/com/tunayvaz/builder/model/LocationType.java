package com.tunayvaz.builder.model;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum LocationType {

    ROME("Rome"),
    BRITAIN("Britain"),
    POLAND("Poland"),
    MIDDLE_EARTH("Middle-Earth");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
