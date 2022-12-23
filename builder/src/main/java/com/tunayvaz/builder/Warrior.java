package com.tunayvaz.builder;

import com.tunayvaz.builder.type.*;
import com.tunayvaz.builder.weapon.Weapon;
import lombok.Getter;

/**
 * Warrior, the class with many parameters.
 */

@Getter
public class Warrior {

    private final Weapon weapon;
    private final String name;
    private final LocationType from;
    private final HairType hair;
    private final ProfessionType profession;
    private final ArmorType armor;

    public Warrior(Builder builder) {
        this.weapon = builder.weapon;
        this.name = builder.name;
        this.from = builder.from;
        this.hair = builder.hair;
        this.profession = builder.profession;
        this.armor = builder.armor;
    }

    public static class Builder {

        private final String name;
        private final ProfessionType profession;

        private LocationType from;
        private HairType hair;
        private ArmorType armor;
        private Weapon weapon;

        public Builder(String name, ProfessionType profession) {
            this.name = name;
            this.profession = profession;
        }

        public Builder weapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder location(LocationType location) {
            this.from = location;
            return this;
        }

        public Builder hair(HairType hair) {
            this.hair = hair;
            return this;
        }

        public Builder armor(ArmorType armor) {
            this.armor = armor;
            return this;
        }

        public Warrior build() {
            return new Warrior(this);
        }
    }

    @Override
    public String toString() {

        var sb = new StringBuilder();
        sb.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);
        sb.append(" with ");
        if (hair != null) {
            sb.append(hair).append(" hair ");
        }
        if (from != null) {
            sb.append("from ").append(from).append(' ');
        }
        if (armor != null) {
            sb.append("wearing ").append(armor).append(' ');
        }
        if (weapon != null) {
            sb.append("and wielding a ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }
}
