package com.tunayvaz.builder.weapon;

import com.tunayvaz.builder.type.WeaponType;
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
