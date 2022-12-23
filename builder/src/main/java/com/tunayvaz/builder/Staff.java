package com.tunayvaz.builder;

import com.tunayvaz.builder.model.SpellType;
import com.tunayvaz.builder.model.StaffMaterialType;
import com.tunayvaz.builder.model.Weapon;
import com.tunayvaz.builder.model.WeaponType;
import lombok.Getter;

@Getter
public class Staff extends Weapon {

    private StaffMaterialType material;
    private SpellType spell;
    private String name;

    public Staff(Builder builder) {
        super(WeaponType.STAFF);
        this.material = builder.material;
        this.spell = builder.spell;
        this.name = builder.name;
    }

    public static class Builder {
        private StaffMaterialType material;
        private SpellType spell;
        private String name;

        public Builder(StaffMaterialType material) {
            this.material = material;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder spell(SpellType spell) {
            this.spell = spell;
            return this;
        }

        public Staff build() {
            return new Staff(this);
        }
    }
}
