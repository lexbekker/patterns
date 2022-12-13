package ru.bekker.adventure.weapons;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Реализация удара топором");
    }
}
