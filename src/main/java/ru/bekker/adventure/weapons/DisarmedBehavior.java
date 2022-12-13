package ru.bekker.adventure.weapons;

public class DisarmedBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Disarmed attack realisation");
    }
}
