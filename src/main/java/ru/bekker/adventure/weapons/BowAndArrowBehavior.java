package ru.bekker.adventure.weapons;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Реализация выстрела стрелой из лука");
    }
}
