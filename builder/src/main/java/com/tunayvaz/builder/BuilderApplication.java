package com.tunayvaz.builder;

import com.tunayvaz.builder.model.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilderApplication.class, args);

        Weapon sword = new Sword.Builder(120, SwordMaterialType.STEEL)
                .withType(SwordType.GLADIUS)
                .withName("Widowmaker")
                .build();

        Staff staff = new Staff.Builder(StaffMaterialType.OAKEN)
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
