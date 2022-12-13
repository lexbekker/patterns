package ru.bekker.adventure.characters;

import ru.bekker.adventure.weapons.SwordBehavior;

public class King extends Character {
    public King() {
        setName("King");
        setWeapon(new SwordBehavior());
    }
}
