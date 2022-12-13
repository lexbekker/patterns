package ru.bekker.adventure.weapons;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Реализация удара ножом");
    }
}
