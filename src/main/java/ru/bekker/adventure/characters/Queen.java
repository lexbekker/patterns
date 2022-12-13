package ru.bekker.adventure.characters;

import ru.bekker.adventure.weapons.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        setWeapon(new BowAndArrowBehavior());
    }
}
