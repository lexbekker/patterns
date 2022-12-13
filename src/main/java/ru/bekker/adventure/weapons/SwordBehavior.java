package ru.bekker.adventure.weapons;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Релизация удара мечом");
    }
}
