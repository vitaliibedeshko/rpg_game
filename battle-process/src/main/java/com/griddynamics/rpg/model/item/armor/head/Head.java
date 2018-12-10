package com.griddynamics.rpg.model.item.armor.head;

import com.griddynamics.rpg.model.backpack.BackpackPlacable;
import com.griddynamics.rpg.model.hero.Hero;
import com.griddynamics.rpg.model.hero.race.RaceType;
import com.griddynamics.rpg.model.hero.specilization.SpecializationType;
import com.griddynamics.rpg.model.item.armor.ArmorType;

import java.util.Set;

public interface Head extends BackpackPlacable {

    void applyItemBonuses(Hero hero);

    void discardItemBonuses(Hero hero);

    ArmorType getArmorType();

    Set<RaceType> getRaceTypes();

    Set<SpecializationType> getSpecializationTypes();

    void applyStats(Hero hero);
}
