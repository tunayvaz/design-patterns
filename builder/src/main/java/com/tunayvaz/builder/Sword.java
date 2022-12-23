package com.tunayvaz.builder;

import com.tunayvaz.builder.model.SwordMaterialType;
import com.tunayvaz.builder.model.SwordType;
import com.tunayvaz.builder.model.Weapon;
import com.tunayvaz.builder.model.WeaponType;
import lombok.Getter;

@Getter
public class Sword extends Weapon {

    private int length;
    private SwordMaterialType material;
    private String name;
    private SwordType swordType;

    private final WeaponType weapon = WeaponType.SWORD;

    public Sword(Builder builder) {
        super(WeaponType.SWORD);
        this.length = builder.length;
        this.material = builder.material;
        this.name = builder.name;
        this.swordType = builder.swordType;
    }

    public static class Builder {

        private final int length;
        private final SwordMaterialType material;
        private String name;
        private SwordType swordType;


        /**
         * Constructor.
         */
        public Builder(int length, SwordMaterialType material) {
            if (length <= 0 || material == null) {
                throw new IllegalArgumentException("Sword length must be bigger than zero and material cannot be null.");
            }
            this.length = length;
            this.material = material;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withType(SwordType swordType) {
            this.swordType = swordType;
            return this;
        }

        public Sword build() {
            return new Sword(this);
        }
    }
}
