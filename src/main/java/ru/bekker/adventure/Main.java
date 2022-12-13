package ru.bekker.adventure;

import ru.bekker.adventure.weapons.AxeBehavior;
import ru.bekker.adventure.characters.Character;
import ru.bekker.adventure.characters.King;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeapon(new AxeBehavior());
        king.fight();
    }
}
