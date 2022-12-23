package com.tunayvaz.builder.model;

import lombok.Data;

@Data
public class Weapon {

    private WeaponType type;

    public Weapon(WeaponType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
