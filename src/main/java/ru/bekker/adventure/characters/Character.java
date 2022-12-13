package ru.bekker.adventure.characters;

import ru.bekker.adventure.weapons.DisarmedBehavior;
import ru.bekker.adventure.weapons.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior weapon = new DisarmedBehavior();
    private String name = "No name";

    public void fight() {
        System.out.print(getCharacterClassName() + " наносит удар: ");
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        System.out.println(getName() + " сменил оружие: " + getWeaponName(weapon) + " на " + getWeaponName(w));
        this.weapon = w;
    }

    public String getWeaponName(WeaponBehavior weapon) {
        return weapon.getClass().getSimpleName().replace("Behavior", "");
    }

    public String getCharacterClassName() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
