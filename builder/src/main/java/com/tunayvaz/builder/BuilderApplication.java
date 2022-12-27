package com.tunayvaz.builder;

import com.tunayvaz.builder.type.*;
import com.tunayvaz.builder.weapon.Staff;
import com.tunayvaz.builder.weapon.Sword;
import com.tunayvaz.builder.weapon.Weapon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Look out! Enemy army approaches!
 * We are going to need a brave soldier and a wise wizard to protect us.
 * If there isn't any, we can build our own warriors because it makes total sense.
 *
 * The need of the Builder pattern is to find a solution to a problem called telescoping constructor anti-pattern
 * which occurs when the object constructor parameter combination leads to a bunch of constructors.
 * Instead of using numerous constructors, the builder pattern uses another object, a builder, that receives each
 * initialization parameter step by step and then returns the resulting constructed object at once.
 */
@SpringBootApplication
@Slf4j
public class BuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilderApplication.class, args);

        Weapon sword = new Sword.Builder(120, SwordMaterialType.STEEL)
                .withType(SwordType.GLADIUS)
                .withName("Widowmaker")
                .build();

        Weapon staff = new Staff.Builder(StaffMaterialType.OAKEN)
                .spell(SpellType.FIRE)
                .name("Stormbringer")
                .build();

        Warrior soldier = new Warrior.Builder("Julius Caesar", ProfessionType.SOLDIER)
                .location(LocationType.ROME)
                .hair(HairType.SHORT)
                .armor(ArmorType.FULL_PLATE)
                .weapon(sword)
                .build();

        Warrior mage = new Warrior.Builder("Gandalf", ProfessionType.MAGE)
                .location(LocationType.MIDDLE_EARTH)
                .hair(HairType.LONG_STRAIGHT)
                .armor(ArmorType.FABRIC)
                .weapon(staff)
                .build();

        log.info(soldier.toString());
        log.info(mage.toString());
    }
}
