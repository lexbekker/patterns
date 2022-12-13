package ru.bekker.simuduck.behaivor.flying;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Now I'm flying with wings!");
    }

}
