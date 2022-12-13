package ru.bekker.adventure.characters;

import ru.bekker.adventure.weapons.AxeBehavior;

public class Knight extends Character {
    public Knight() {
        setWeapon(new AxeBehavior());
    }
}
