package ru.bekker.adventure.characters;

import ru.bekker.adventure.weapons.KnifeBehavior;

public class Troll extends Character {
    public Troll() {
        setWeapon(new KnifeBehavior());
    }
}
